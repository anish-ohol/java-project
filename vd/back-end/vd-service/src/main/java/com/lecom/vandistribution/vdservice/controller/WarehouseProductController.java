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

import com.lecom.vandistribution.vdservice.dto.WarehouseProductEntryDTO;
import com.lecom.vandistribution.vdservice.service.WarehouseProductService;


@CrossOrigin
@RestController
public class WarehouseProductController {	
	
	@Autowired
	private WarehouseProductService warehouseProductService;
	
	@GetMapping("/warehouse/products")
	public List<WarehouseProductEntryDTO> getWarehouseProducts(){		
		return warehouseProductService.getWarehouseProducts();
	}
	
	@GetMapping("/warehouse/products/{id}")
	public WarehouseProductEntryDTO getWarehouseProducts(@PathVariable Integer id){		
		return warehouseProductService.getWarehouseProducts(id);
	}
	
	@PutMapping("/warehouse/products/{id}")
	public WarehouseProductEntryDTO updateWarehouseProducts(@PathVariable Integer id,@RequestBody WarehouseProductEntryDTO warehouseProductEntryDTO){		
		return warehouseProductService.updateWarehouseProducts(id,warehouseProductEntryDTO);
	}
	
	@PostMapping("/warehouse/products")
	public WarehouseProductEntryDTO addWarehouseProducts(@RequestBody WarehouseProductEntryDTO warehouseProductEntryDTO){		
		return warehouseProductService.addWarehouseProducts(warehouseProductEntryDTO);
	}
	
	
	

}
