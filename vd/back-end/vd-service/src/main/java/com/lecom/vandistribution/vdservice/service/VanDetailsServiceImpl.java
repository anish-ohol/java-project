package com.lecom.vandistribution.vdservice.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.VanDetailsEntity;
import com.lecom.vandistribution.vdservice.dao.VanDetailsRepository;
import com.lecom.vandistribution.vdservice.dto.VanDetailsDTO;
import com.lecom.vandistribution.vdservice.exception.VanNotFoundException;
import com.lecom.vandistribution.vdservice.util.VdUtil;


@Service("vanDetailsService")
public class VanDetailsServiceImpl implements VanDetailsService {

	@Autowired
	private VanDetailsRepository vanDetailsRepo;

	@Autowired
	private VdUtil vdUtil;

	@Override
	public List<VanDetailsDTO> getVanDetails() {
		List<VanDetailsEntity> vanDetailsEntities = (List<VanDetailsEntity>) vanDetailsRepo.findAll();
		return vdUtil.mapObjectList(vanDetailsEntities, VanDetailsDTO.class);
	}

	@Override
	public VanDetailsDTO getVanDetails(Integer id) {

		if (vanDetailsRepo.existsById(id)) {
			VanDetailsEntity vanDetailsEntity = (VanDetailsEntity) vanDetailsRepo.findById(id).get();
			return vdUtil.mapObject(vanDetailsEntity, VanDetailsDTO.class);
		}
		throw new VanNotFoundException();
	}

	@Override
	public VanDetailsDTO getVanDetails(String number) {

		if (vanDetailsRepo.existsByVanNumber(number)) {
			VanDetailsEntity vanDetailsEntity = (VanDetailsEntity) vanDetailsRepo.findByVanNumber(number).get();
			return vdUtil.mapObject(vanDetailsEntity, VanDetailsDTO.class);
		}

		throw new VanNotFoundException();
	}

	@Override
	public VanDetailsDTO updateVanDetails(Integer id, VanDetailsDTO vanDetailsDTO) {

		if (vanDetailsRepo.existsById(id)) {
			Timestamp ct = vanDetailsRepo.findById(id).get().getCreated_date_time();
			Timestamp ut = new Timestamp(System.currentTimeMillis());
			VanDetailsEntity vanDetailsEntity = vdUtil.mapObject(vanDetailsDTO, VanDetailsEntity.class);
			vanDetailsEntity.setCreated_date_time(ct);
			vanDetailsEntity.setUpdated_date_time(ut);
			vanDetailsEntity = vanDetailsRepo.save(vanDetailsEntity);
			return vdUtil.mapObject(vanDetailsEntity, VanDetailsDTO.class);
		}

		throw new VanNotFoundException();
	}

	@Override
	public VanDetailsDTO addVanDetails(VanDetailsDTO vanDetailsDTO) {		
			Timestamp ct = new Timestamp(System.currentTimeMillis());			
			VanDetailsEntity vanDetailsEntity = vdUtil.mapObject(vanDetailsDTO, VanDetailsEntity.class);
			vanDetailsEntity.setCreated_date_time(ct);
			vanDetailsEntity.setUpdated_date_time(ct);
			vanDetailsEntity = vanDetailsRepo.save(vanDetailsEntity);
			return vdUtil.mapObject(vanDetailsEntity, VanDetailsDTO.class);		
	}

	@Override
	public Boolean removeVanDetails(Integer id) {
		vanDetailsRepo.deleteById(id);
		return !vanDetailsRepo.existsById(id);
	}

}
