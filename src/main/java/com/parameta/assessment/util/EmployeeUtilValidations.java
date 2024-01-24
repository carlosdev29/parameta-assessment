package com.parameta.assessment.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

import com.parameta.assessment.service.dto.EmployeeDTOIn;


//import com.parameta.assessment.service.dto.EmployeeDTOIn;

public class EmployeeUtilValidations {
	
	public static void main(String[] args) {
		
				
	}
	
	/*public static void main(String[] args) {
		EmployeeDTOIn employeeDTOIn = new EmployeeDTOIn();
		//employeeDTOIn = null;
		/*employeeDTOIn.setId(1L);
		employeeDTOIn.setName("Carlin");
		employeeDTOIn.setLastName("Sanduche");*/
		
		
		//Metodo uno
		//Date c = new Date();
		//System.out.println(c);
		//employeeDTOIn.setLinkDate(c);
		//System.out.println(employeeDTOIn.getLinkDate());
		//validateDateFormat(employeeDTOIn.getLinkDate());
		
		//String miOpcionalNull = "";
		//Metodo 2);
		//String name = "Carlos";
		/*Optional<String> myValue = Optional.of(name);
		
		if (myValue.isPresent()) {
			System.out.println("There is values 1");
		}
		
		Optional<EmployeeDTOIn> mySecondValue = Optional.ofNullable(employeeDTOIn);
		
		if (mySecondValue.isPresent()) {
			System.out.println("There is Values 2");
		}else {
			System.out.println("There is not Values 2");
		}*/
		
		//Metodo 3
		
		/*DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthdate = LocalDate.parse("15/08/1993", fmt);
		LocalDate myLocal = LocalDate.now();
		Period edad = Period.between(birthdate, myLocal);
		System.out.println("edad: "+edad.getYears());*/
		//validateMajorAge(employeeDTOIn);
		
		
		
	//}
	
	
	public String validateDateFormat(Date dateToValidate) {
		System.out.println(dateToValidate);;
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
