package org.timmyaditya.numberplay.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.timmyaditya.numberplay.dao.SumDao;
import org.timmyaditya.numberplay.model.DigitSum;

public class SumDaoImpl implements SumDao{
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertNumber(DigitSum digitSum) {
		//connect database and insert entered number and sum of digits
		System.out.println("Inside sumDaoImpl");
		System.out.println("entered number:"+digitSum.getEnteredNumber() + "digit sum:"+digitSum.getSumOfDigits());
	
		String query="INSERT INTO sumTable(enteredNumber1, sumOfDigits) VALUES("+digitSum.getEnteredNumber()+","+digitSum.getSumOfDigits()+")";
		  System.out.println("Record inserted succ in sum table");
		  System.out.println(jdbcTemplate==null);
		  jdbcTemplate.update(query);
	}
	
	

}
