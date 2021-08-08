package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.WarehouseProductEntryRepository;
import com.lecom.vandistribution.vdservice.dto.WarehouseProductEntryDTO;


@Service("warehouseProductService")
public class WarehouseProductServiceImpl implements WarehouseProductService{
	
	@Autowired
	private WarehouseProductEntryRepository warehouseProductEntryRepository;

	@Override
	public List<WarehouseProductEntryDTO> getWarehouseProducts() {
		return null;
	}

	@Override
	public WarehouseProductEntryDTO getWarehouseProducts(Integer id) {
		return null;
	}

	@Override
	public WarehouseProductEntryDTO addWarehouseProducts(WarehouseProductEntryDTO warehouseProductEntryDTO) {
		return null;
	}

	@Override
	public WarehouseProductEntryDTO updateWarehouseProducts(Integer id,
			WarehouseProductEntryDTO warehouseProductEntryDTO) {
		return null;
	}

}
