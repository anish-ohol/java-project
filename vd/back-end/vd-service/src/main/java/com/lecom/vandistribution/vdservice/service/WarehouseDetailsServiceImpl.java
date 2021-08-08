package com.lecom.vandistribution.vdservice.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.WarehouseDetailsEntity;
import com.lecom.vandistribution.vdservice.dao.WarehouseDetailsRepository;
import com.lecom.vandistribution.vdservice.dto.WarehouseDetailsDTO;
import com.lecom.vandistribution.vdservice.util.VdUtil;

@Service("warehouseService")
public class WarehouseDetailsServiceImpl implements WarehouseDetailsService {

	@Autowired
	private WarehouseDetailsRepository warehouseDetailsRepo;

	@Autowired
	private VdUtil vdUtil;

	@Override
	public List<WarehouseDetailsDTO> getWarehouseDetails() {
		List<WarehouseDetailsEntity> warehouseDetails = (List<WarehouseDetailsEntity>) warehouseDetailsRepo.findAll();
		return vdUtil.mapObjectList(warehouseDetails, WarehouseDetailsDTO.class);
	}

	@Override
	public WarehouseDetailsDTO getWarehouseDetails(Integer id) {		
		WarehouseDetailsEntity warehouseDetails =  (WarehouseDetailsEntity) warehouseDetailsRepo.findById(id).get();
		return vdUtil.mapObject(warehouseDetails, WarehouseDetailsDTO.class);
	}

	@Override
	public WarehouseDetailsDTO addWarehouseDetails(WarehouseDetailsDTO warehouseDetailsDTO) {
		Timestamp ct = new Timestamp(System.currentTimeMillis());
		WarehouseDetailsEntity warehouseDetailsEntity=vdUtil.mapObject(warehouseDetailsDTO, WarehouseDetailsEntity.class);
		warehouseDetailsEntity.setCreated_date_time(ct);
		warehouseDetailsEntity.setUpdated_date_time(ct);
		warehouseDetailsEntity= warehouseDetailsRepo.save(warehouseDetailsEntity);
		return vdUtil.mapObject(warehouseDetailsEntity, WarehouseDetailsDTO.class);
	}
	
	@Override
	public WarehouseDetailsDTO updateWarehouseDetails(Integer id,WarehouseDetailsDTO warehouseDetailsDTO) {
		
		WarehouseDetailsEntity warehouseDetailsEntity=vdUtil.mapObject(warehouseDetailsDTO, WarehouseDetailsEntity.class);
		Timestamp ct  = warehouseDetailsRepo.findById(id).get().getCreated_date_time();
		Timestamp ut = new Timestamp(System.currentTimeMillis());
		warehouseDetailsEntity.setCreated_date_time(ct);
		warehouseDetailsEntity.setUpdated_date_time(ut);
		warehouseDetailsEntity= warehouseDetailsRepo.save(warehouseDetailsEntity);
		
		return vdUtil.mapObject(warehouseDetailsEntity, WarehouseDetailsDTO.class);
	}

}
