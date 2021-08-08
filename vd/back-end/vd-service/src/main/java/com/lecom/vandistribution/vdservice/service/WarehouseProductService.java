package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.WarehouseProductEntryDTO;

public interface WarehouseProductService {
	
	 public List<WarehouseProductEntryDTO>getWarehouseProducts();
	 public WarehouseProductEntryDTO getWarehouseProducts(Integer id);
	 public WarehouseProductEntryDTO addWarehouseProducts(WarehouseProductEntryDTO warehouseProductEntryDTO);
	 public WarehouseProductEntryDTO updateWarehouseProducts(Integer id,WarehouseProductEntryDTO warehouseProductEntryDTO);

}
