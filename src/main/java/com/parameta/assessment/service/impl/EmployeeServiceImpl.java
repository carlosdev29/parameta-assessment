package com.parameta.assessment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parameta.assessment.db.dao.EntityDao;
import com.parameta.assessment.db.dao.IEmployeeDao;
import com.parameta.assessment.service.IEmployeeService;
import com.parameta.assessment.service.dto.EmployeeDTOIn;
import com.parameta.assessment.service.dto.EmployeeDTOOut;
import com.parameta.assessment.util.EmployeeValidationsUtilI;


@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private IEmployeeDao emplDao;
	
	
	@Override
	public EmployeeDTOOut selectEmployeeByEmployee(EmployeeDTOIn employeeDTOIn) {
		EmployeeDTOOut employeeDTOOut = new EmployeeDTOOut();
		EmployeeValidationsUtilI util = new EmployeeValidationsUtilI();
		Boolean isNull =  util.validateEmptyNull(employeeDTOIn);
		String dateCorrectBirth = util
				.validateDateFormat(employeeDTOIn.getBirthDate());
		String linkCorrectBirth = util
				.validateDateFormat(employeeDTOIn.getLinkDate());
		Boolean isMajor = util.validateMajorAge(dateCorrectBirth);
		
		return employeeDTOOut;
	}
	
	
	
	

}
