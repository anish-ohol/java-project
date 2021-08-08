package com.lecom.vandistribution.vdservice.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.EmployeeEntity;
import com.lecom.vandistribution.vdservice.dao.EmployeeRepository;
import com.lecom.vandistribution.vdservice.dto.EmployeeDTO;
import com.lecom.vandistribution.vdservice.exception.EmployeeNotFoundException;
import com.lecom.vandistribution.vdservice.util.VdUtil;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private VdUtil vdUtil;

	@Override
	public List<EmployeeDTO> getEmployees() {

		List<EmployeeEntity> employEntities = (List<EmployeeEntity>) employeeRepo.findAll();
		if (employEntities != null && !employEntities.isEmpty()) {
			List<EmployeeDTO> employeeDTOs = vdUtil.mapObjectList(employEntities, EmployeeDTO.class);
			return employeeDTOs;
		}
		throw new EmployeeNotFoundException();

	}

	@Override
	public EmployeeDTO getEmployees(Integer id) {

		Optional<EmployeeEntity> employEntities = employeeRepo.findById(id);
		if (employEntities != null && employEntities.isPresent()) {
			EmployeeEntity employEntity = employEntities.get();
			EmployeeDTO employeeDTO = vdUtil.mapObject(employEntity, EmployeeDTO.class);
			return employeeDTO;
		}

		throw new EmployeeNotFoundException();
	}

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
		Timestamp ct = new Timestamp(System.currentTimeMillis());
		EmployeeEntity employEntity = vdUtil.mapObject(employeeDTO, EmployeeEntity.class);
		employEntity.setCreated_date_time(ct);
		employEntity.setUpdated_date_time(ct);
		employEntity = employeeRepo.save(employEntity);
		return vdUtil.mapObject(employEntity, EmployeeDTO.class);
	}

	@Override
	public EmployeeDTO updateEmployee(Integer id, EmployeeDTO employeeDTO) {
		if (employeeRepo.existsById(id)) {
			Timestamp ct = employeeRepo.findById(id).get().getCreated_date_time();
			Timestamp ut = new Timestamp(System.currentTimeMillis());
			EmployeeEntity employEntity = vdUtil.mapObject(employeeDTO, EmployeeEntity.class);
			employEntity.setCreated_date_time(ct);
			employEntity.setUpdated_date_time(ut);
			employEntity = employeeRepo.save(employEntity);
			return vdUtil.mapObject(employEntity, EmployeeDTO.class);
		}
		throw new EmployeeNotFoundException();
	}

	@Override
	public Boolean removeEmployees(Integer id) {
		employeeRepo.deleteById(id);
		return !employeeRepo.existsById(id);
	}

}
