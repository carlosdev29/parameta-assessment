package com.parameta.assessment.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import com.parameta.assessment.service.dto.EmployeeDTOIn;



public class EmployeeValidationsUtilI  {
	
	
	public String validateDateFormat(Date dateToValidate) {
		System.out.println(dateToValidate);
		DateFormat dateFormat = DateFormat.getDateInstance();
		System.out.println(dateFormat.format(dateToValidate));
		SimpleDateFormat correctDateFormat = new 
				SimpleDateFormat("yyyy/MM/dd");
		String correctFormatOutput = "";
		System.out.println(correctFormatOutput);
		Integer resp =correctDateFormat.format(dateToValidate).
				compareTo(dateFormat.format(dateToValidate));
		System.out.println("resp: "+resp);
		if (resp==0){
			correctFormatOutput = dateFormat.format(dateToValidate);
		} else {
			correctFormatOutput = correctDateFormat.format(dateToValidate);
		}
		return correctFormatOutput;
		
	}
	
	public Boolean validateEmptyNull(EmployeeDTOIn employeeDTOIn) {
		Boolean resp = true;
		Optional<EmployeeDTOIn> mySecondValue = Optional.ofNullable(employeeDTOIn);
		if (!mySecondValue.isPresent()) {
			resp = false;
		}
		return resp;
	}
	
	
	public Boolean validateMajorAge(String dateString) {
		//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format = DateTimeFormatter.ofPattern(dateString);
		LocalDate fechaNac = LocalDate.parse("15/08/1993", format);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		int years = periodo.getYears();
		int months = periodo.getMonths();
		int days = periodo.getDays();
		System.out.println("years: "+years);
		if (years>17) {
			return true;
		}
		return false;
	}
	
	

}
