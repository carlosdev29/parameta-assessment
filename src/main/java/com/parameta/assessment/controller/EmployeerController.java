package com.parameta.assessment.controller;

import java.util.Date;

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
		/*EmployeeDTOOut employeeDTOOut = employeeService.
				selectEmployeeByEmployee(employeeDTOIn);*/
		EmployeeDTOOut employeeDTOOut = new EmployeeDTOOut();
		employeeDTOOut.setId(1L);
		employeeDTOOut.setName("Carlos");
		employeeDTOOut.setLastName("Sanz");
		employeeDTOOut.setDocumentType("CC");
		employeeDTOOut.setDocumentNumber("1015");
		employeeDTOOut.setLinkDate(new Date());
		employeeDTOOut.setBirthDate(new Date());
		employeeDTOOut.setJobTittle("Engineer");
		employeeDTOOut.setSalary(1000L);
		employeeDTOOut.setEmployeeAge(27);
		employeeDTOOut.setLinkTime(8L);
		return employeeDTOOut;
	}

}
