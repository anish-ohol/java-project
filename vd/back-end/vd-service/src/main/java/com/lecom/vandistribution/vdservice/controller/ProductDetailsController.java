package com.lecom.vandistribution.vdservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lecom.vandistribution.vdservice.dto.ProductDetailsDTO;
import com.lecom.vandistribution.vdservice.service.ProductDetailsService;


@CrossOrigin
@RestController
public class ProductDetailsController {
	
	@Autowired
	private ProductDetailsService productDetailsService;
	
	@GetMapping("/product")
	public List<ProductDetailsDTO>getProductDetails(){		
		return productDetailsService.getProductDetails();		
	}
	
	@GetMapping("/product/{id}")
	public ProductDetailsDTO getProductDetails(@PathVariable Integer id){		
		return productDetailsService.getProductDetails(id);		
	}
	

	@PutMapping("/product/{id}")
	public ProductDetailsDTO updateProductDetails(@PathVariable Integer id, @RequestBody ProductDetailsDTO productDetailsDTO){		
		return productDetailsService.updateProductDetails(id, productDetailsDTO);		
	}
	
	@PostMapping("/product")
	public ProductDetailsDTO addProductDetails( @RequestBody ProductDetailsDTO productDetailsDTO){		
		return productDetailsService.addProductDetails(productDetailsDTO);		
	}
	
	@DeleteMapping("/product/{id}")
	public Boolean removeProductDetails(@PathVariable Integer id){		
		return productDetailsService.removeProductDetails(id);		
	}
	

}
