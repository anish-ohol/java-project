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

import com.lecom.vandistribution.vdservice.dto.EmployeeDTO;
import com.lecom.vandistribution.vdservice.service.EmployeeService;


@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<EmployeeDTO> getEmployees(){		
		return employeeService.getEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public EmployeeDTO getEmployees(@PathVariable Integer id){		
		return employeeService.getEmployees(id);
	}
	
	@PutMapping("/employee/{id}")
	public EmployeeDTO updateEmployees(@PathVariable Integer id,@RequestBody EmployeeDTO employeeDTO){		
		return employeeService.updateEmployee(id,employeeDTO);
	}
	
	@PostMapping("/employee")
	public EmployeeDTO addEmployees(@RequestBody  EmployeeDTO employeeDTO){		
		return employeeService.addEmployee(employeeDTO);
	}
	
	@DeleteMapping("/employee/{id}")
	public Boolean removeEmployees(@PathVariable Integer id){		
		return employeeService.removeEmployees(id);
	}

}
