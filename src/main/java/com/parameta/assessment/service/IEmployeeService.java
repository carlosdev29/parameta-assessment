package com.parameta.assessment.service;

import com.parameta.assessment.service.dto.EmployeeDTOIn;
import com.parameta.assessment.service.dto.EmployeeDTOOut;

public interface IEmployeeService {
	
	public EmployeeDTOOut selectEmployeeByEmployee(EmployeeDTOIn employeeDTOIn);

}
