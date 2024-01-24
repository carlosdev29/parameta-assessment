package com.parameta.assessment.service.dto;

public class EmployeeDTOOut extends EmployeeDTO {
	
	private Long linkTime;
	private Integer employeeAge;
	
	public Long getLinkTime() {
		return linkTime;
	}
	public void setLinkTime(Long linkTime) {
		this.linkTime = linkTime;
	}
	public Integer getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	

}
