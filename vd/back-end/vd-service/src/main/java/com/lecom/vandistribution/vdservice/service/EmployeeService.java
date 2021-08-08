package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.EmployeeDTO;

public interface EmployeeService {
	
	 public List<EmployeeDTO>getEmployees();
	 public EmployeeDTO getEmployees(Integer id);
	 public EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
	 public EmployeeDTO updateEmployee(Integer id ,EmployeeDTO employeeDTO);
	 public Boolean removeEmployees(Integer id);

}
