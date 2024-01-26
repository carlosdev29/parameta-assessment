package com.parameta.assessment.db.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.parameta.assessment.db.dao.entity.EmployeeEntityDao;


@Repository
public interface IEmployeeDao {
	
	@Query("SELECT * FROM parameta_db.tbl_employee\r\n"
			+ "WHERE name_employee =: name\r\n"
			+ "AND last_name_employee =: lastName\r\n"
			+ "AND document_type =: documentType\r\n"
			+ "AND document_number =: documentNumber\r\n"
			+ "AND job_tittle =: jobTittle\r\n"
			+ "AND salary =: salary")
	public EmployeeEntityDao selectEmployeeByParameters(@Param("name") String name,
			@Param("lastName") String lastNanme,@Param("documentType") String documentType, 
			@Param("documentNumber") String documentNumber, @Param("jobTittle")String jobTittle, 
			@Param("salary") String salary );
	
	/*public int insertEmployee(EntityDao entityDao);
	
	public EntityDao selectEmployeeDao(EntityDao entityDao);*/

}
