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

import com.lecom.vandistribution.vdservice.dto.CustomerDetailsDTO;
import com.lecom.vandistribution.vdservice.service.CustomerDetailsService;

@CrossOrigin
@RestController
public class CustomerDetailsController {

	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@GetMapping("/customer")
	public List<CustomerDetailsDTO>getCustomerDetails(){		
		return customerDetailsService.getCustomerDetails();		
	}
	
	@GetMapping("/customer/{id}")
	public CustomerDetailsDTO getCustomerDetails(@PathVariable Integer id){		
		return customerDetailsService.getCustomerDetails(id);		
	}
	
	
	@PutMapping("/customer/{id}")
	public CustomerDetailsDTO updateCustomerDetails(@PathVariable Integer id, @RequestBody CustomerDetailsDTO customerDetailsDTO){		
		return customerDetailsService.updateCustomerDetails(id, customerDetailsDTO);		
	}
	
	@PostMapping("/customer")
	public CustomerDetailsDTO addCustomerDetails( @RequestBody CustomerDetailsDTO customerDetailsDTO){		
		return customerDetailsService.addCustomerDetails(customerDetailsDTO);		
	}
	
	@DeleteMapping("/customer/{id}")
	public Boolean removeCustomerDetails(@PathVariable Integer id){		
		return customerDetailsService.removeCustomerDetails(id);		
	}

}
