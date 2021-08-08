package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.WarehouseProductStockDTO;

public interface ProductStockService {
	
	 public List<WarehouseProductStockDTO>getWarehouseProductStock();
	 public WarehouseProductStockDTO getWarehouseProductStock(Integer id);
	 public List<WarehouseProductStockDTO>getWarehouseActiveProductStock();
	 public WarehouseProductStockDTO addWarehouseProductStock(WarehouseProductStockDTO warehouseProductStockDTO);
	 public WarehouseProductStockDTO updateWarehouseProductStock(Integer id,WarehouseProductStockDTO warehouseProductStockDTO);
}
