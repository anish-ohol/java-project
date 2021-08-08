package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.WarehouseProductStockRepository;
import com.lecom.vandistribution.vdservice.dto.WarehouseProductStockDTO;


@Service("productStockService")
public class ProductStockServiceImpl implements ProductStockService{
	

	@Autowired
	private WarehouseProductStockRepository warehouseProductStockRepository;

	@Override
	public List<WarehouseProductStockDTO> getWarehouseProductStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarehouseProductStockDTO getWarehouseProductStock(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WarehouseProductStockDTO> getWarehouseActiveProductStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarehouseProductStockDTO addWarehouseProductStock(WarehouseProductStockDTO warehouseProductStockDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarehouseProductStockDTO updateWarehouseProductStock(Integer id,
			WarehouseProductStockDTO warehouseProductStockDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
