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

import com.lecom.vandistribution.vdservice.dto.WarehouseDetailsDTO;
import com.lecom.vandistribution.vdservice.service.WarehouseDetailsService;


@CrossOrigin
@RestController
public class WarehouseDetailsController {	
	
	@Autowired
	private WarehouseDetailsService warehouseDetailsService;
	
	@GetMapping("/warehouse")
	public List<WarehouseDetailsDTO> getWarehouseDetails(){		
		return warehouseDetailsService.getWarehouseDetails();
	}
	
	@GetMapping("/warehouse/{id}")
	public WarehouseDetailsDTO getWarehouseDetails(@PathVariable Integer id){		
		return warehouseDetailsService.getWarehouseDetails(id);
	}
	
	@PutMapping("/warehouse/{id}")
	public WarehouseDetailsDTO updateWarehouseDetails(@PathVariable Integer id,@RequestBody WarehouseDetailsDTO warehouseDetailsEntity){		
		return warehouseDetailsService.updateWarehouseDetails(id,warehouseDetailsEntity);
	}
	
	@PostMapping("/warehouse")
	public WarehouseDetailsDTO addWarehouseDetails(@RequestBody WarehouseDetailsDTO warehouseDetailsEntity){		
		return warehouseDetailsService.addWarehouseDetails(warehouseDetailsEntity);
	}

}
