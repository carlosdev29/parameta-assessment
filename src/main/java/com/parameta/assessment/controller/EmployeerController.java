package com.parameta.assessment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parameta.assessment.service.IEmployeeService;
import com.parameta.assessment.service.dto.EmployeeDTOIn;
import com.parameta.assessment.service.dto.EmployeeDTOOut;

@RestController
@RequestMapping(value = "/employee")
public class EmployeerController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping(value = "/getemployee")
	public EmployeeDTOOut consultEmployeeFull(EmployeeDTOIn employeeDTOIn) {
		EmployeeDTOOut employeeDTOOut = employeeService.
				selectEmployeeByEmployee(employeeDTOIn);
		return employeeDTOOut;
	}
	
	
	

}
