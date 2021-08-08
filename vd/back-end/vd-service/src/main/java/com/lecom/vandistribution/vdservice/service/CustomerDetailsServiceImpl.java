package com.lecom.vandistribution.vdservice.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.CustomerDetailsEntity;
import com.lecom.vandistribution.vdservice.dao.CustomerDetailsRepository;
import com.lecom.vandistribution.vdservice.dto.CustomerDetailsDTO;
import com.lecom.vandistribution.vdservice.exception.CustomerNotFoundException;
import com.lecom.vandistribution.vdservice.util.VdUtil;

@Service("customerDetailsService")
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private CustomerDetailsRepository customerDetailsRepo;

	@Autowired
	private VdUtil vdUtil;

	@Override
	public List<CustomerDetailsDTO> getCustomerDetails() {
		List<CustomerDetailsEntity> customerDetailsEntities = (List<CustomerDetailsEntity>) customerDetailsRepo
				.findAll();
		List<CustomerDetailsDTO> customerDetailsDTOs = vdUtil.mapObjectList(customerDetailsEntities,
				CustomerDetailsDTO.class);
		return customerDetailsDTOs;
	}

	@Override
	public CustomerDetailsDTO getCustomerDetails(Integer id) {
		if (customerDetailsRepo.existsById(id)) {
			CustomerDetailsEntity customerDetailsEntity = (CustomerDetailsEntity) customerDetailsRepo.findById(id)
					.get();
			CustomerDetailsDTO customerDetailsDTO = vdUtil.mapObject(customerDetailsEntity, CustomerDetailsDTO.class);
			return customerDetailsDTO;
		}
		throw new CustomerNotFoundException();
	}

	@Override
	public CustomerDetailsDTO updateCustomerDetails(Integer id, CustomerDetailsDTO customerDetailsDTO) {
		if (customerDetailsRepo.existsById(id)) {
			Timestamp ct  = customerDetailsRepo.findById(id).get().getCreated_date_time();
			Timestamp ut  = new Timestamp(System.currentTimeMillis());
			CustomerDetailsEntity customerDetailsEntity= vdUtil.mapObject(customerDetailsDTO, CustomerDetailsEntity.class);
			customerDetailsEntity.setCreated_date_time(ct);
			customerDetailsEntity.setUpdated_date_time(ut);
			customerDetailsRepo.save(customerDetailsEntity);
			customerDetailsDTO= vdUtil.mapObject(customerDetailsEntity, CustomerDetailsDTO.class);
			return customerDetailsDTO;
		}
		throw new CustomerNotFoundException();
	}

	@Override
	public CustomerDetailsDTO addCustomerDetails(CustomerDetailsDTO customerDetailsDTO) {
		
			Timestamp ct  = new Timestamp(System.currentTimeMillis());
			CustomerDetailsEntity customerDetailsEntity= vdUtil.mapObject(customerDetailsDTO, CustomerDetailsEntity.class);
			customerDetailsEntity.setCreated_date_time(ct);
			customerDetailsEntity.setUpdated_date_time(ct);
			customerDetailsRepo.save(customerDetailsEntity);
			customerDetailsDTO= vdUtil.mapObject(customerDetailsEntity, CustomerDetailsDTO.class);
			return customerDetailsDTO;		
	}

	@Override
	public Boolean removeCustomerDetails(Integer id) {
		if (customerDetailsRepo.existsById(id)) {
			customerDetailsRepo.deleteById(id);
			return !customerDetailsRepo.existsById(id);
		}
		throw new CustomerNotFoundException();
	}

}
