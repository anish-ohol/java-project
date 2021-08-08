package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.WarehouseDetailsDTO;

public interface WarehouseDetailsService {

	 public List<WarehouseDetailsDTO>getWarehouseDetails();
	 public WarehouseDetailsDTO getWarehouseDetails(Integer id);
	 public WarehouseDetailsDTO addWarehouseDetails(WarehouseDetailsDTO warehouseDetailsDTO);
	 public WarehouseDetailsDTO updateWarehouseDetails(Integer id,WarehouseDetailsDTO warehouseDetailsDTO);
	 
}
