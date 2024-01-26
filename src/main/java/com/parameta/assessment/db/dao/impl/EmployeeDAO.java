package com.parameta.assessment.db.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.parameta.assessment.db.dao.IEmployeeDao;
import com.parameta.assessment.db.dao.entity.EmployeeEntityDao;


public class EmployeeDAO{
	
	/*
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertEmployee(EntityDao entityDao) {
		String queryInsert = "INSERT INTO "
				+ "`parameta_db`.`tbl_employee` (`name_employee`, `last_name_employee`,"
				+ " `document_type`, `document_number`, `job_tittle`, `salary`) \r\n"
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		int respQuery = this.jdbcTemplate.update(queryInsert , new Object[]
				{entityDao.getName(), entityDao.getLastName(), entityDao.getDocumentType(),
				entityDao.getDocumentNumber(), entityDao.getJobTittle(), entityDao.getSalary()});
		return respQuery;
	}
	
	@Override
	public EntityDao selectEmployeeDao(EntityDao entityDao) {
		// TODO Auto-generated method stub
		String querySelect = "Select * from tbl_empoyee";
		this.jdbcTemplate.query(querySelect, null);
		return null;
	}*/
	

}
