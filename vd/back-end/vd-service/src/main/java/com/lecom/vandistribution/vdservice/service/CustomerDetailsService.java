package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.CustomerDetailsDTO;

public interface CustomerDetailsService {
	
	public List<CustomerDetailsDTO> getCustomerDetails();
	public CustomerDetailsDTO getCustomerDetails(Integer id);
	public CustomerDetailsDTO updateCustomerDetails(Integer id,CustomerDetailsDTO customerDetailsDTO);
	public CustomerDetailsDTO addCustomerDetails(CustomerDetailsDTO customerDetailsDTO);
	public Boolean removeCustomerDetails(Integer id);
}
