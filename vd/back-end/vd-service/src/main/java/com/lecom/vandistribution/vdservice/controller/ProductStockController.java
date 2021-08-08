package com.lecom.vandistribution.vdservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lecom.vandistribution.vdservice.dto.WarehouseProductStockDTO;
import com.lecom.vandistribution.vdservice.service.ProductStockService;


@CrossOrigin
@RestController
public class ProductStockController {	
	
	@Autowired
	private ProductStockService productStockService;
	
	@GetMapping("/warehouse/productstock")
	public List<WarehouseProductStockDTO> getWarehouseProducts(){		
		return productStockService.getWarehouseProductStock();
	}
	
	@GetMapping("/warehouse/productstock/{id}")
	public WarehouseProductStockDTO getWarehouseProducts(@PathVariable Integer id){		
		return productStockService.getWarehouseProductStock(id);
	}
	
	@PutMapping("/warehouse/productstock/{id}")
	public WarehouseProductStockDTO updateWarehouseProducts(@PathVariable Integer id,@RequestBody WarehouseProductStockDTO warehouseProductStockDTO){		
		return productStockService.updateWarehouseProductStock(id,warehouseProductStockDTO);
	}
	
	@PostMapping("/warehouse/productstock")
	public WarehouseProductStockDTO addWarehouseProducts(@RequestBody WarehouseProductStockDTO warehouseProductStockDTO){		
		return productStockService.addWarehouseProductStock(warehouseProductStockDTO);
	}
	
	
	

}
