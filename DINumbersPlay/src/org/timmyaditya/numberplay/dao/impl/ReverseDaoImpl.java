package org.timmyaditya.numberplay.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.timmyaditya.numberplay.dao.ReverseDao;
import org.timmyaditya.numberplay.model.DigitReverse;

public class ReverseDaoImpl implements ReverseDao{
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertNumbers(DigitReverse digitReverse) {
		//connect database and insert entered number and sum of digits
		System.out.println("Inside ReverseDaoImpl");
		System.out.println("entered number:"+digitReverse.getEnteredNumber() + "digit reverse:"+digitReverse.getReverseOfDigits());
		
		String query="INSERT INTO reverseTable(enteredNumber2, reverseOfDigits) VALUES("+digitReverse.getEnteredNumber()+","+digitReverse.getReverseOfDigits()+")";
		  System.out.println("Record inserted succ in sum table");
		  jdbcTemplate.update(query);
		
	}
	

}
