package com.parameta.assessment.service.impl;

import org.springframework.stereotype.Service;

import com.parameta.assessment.service.IEmployeeService;
import com.parameta.assessment.service.dto.EmployeeDTOIn;
import com.parameta.assessment.service.dto.EmployeeDTOOut;
import com.parameta.assessment.util.EmployeeUtilValidations;


@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	
	
	@Override
	public EmployeeDTOOut selectEmployeeByEmployee(EmployeeDTOIn employeeDTOIn) {
		EmployeeDTOOut employeeDTOOut = new EmployeeDTOOut();
		EmployeeUtilValidations util = new EmployeeUtilValidations();
		String dateCorrect = util.validateDateFormat(employeeDTOIn.getBirthDate());
		Boolean isNull = util.validateEmptyNull(employeeDTOIn);
		Boolean isMajor = util.validateMajorAge(dateCorrect);
		return employeeDTOOut;
	}
	
	

}
