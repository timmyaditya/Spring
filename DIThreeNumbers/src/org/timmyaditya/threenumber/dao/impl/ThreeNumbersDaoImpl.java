package org.timmyaditya.threenumber.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.timmyaditya.threenumber.dao.ThreeNumbersDao;
import org.timmyaditya.threenumber.model.ThreeNumbers;

public class ThreeNumbersDaoImpl implements ThreeNumbersDao{
	
	//get the jdbcTemplate and then insert into database
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertNumber(ThreeNumbers threeNumbers) {
		System.out.println("fno = "+threeNumbers.getFno()+ "sno = "+ threeNumbers.getSno()+"tno = "+ threeNumbers.getTno() + "max = "+ threeNumbers.getMax());
		//insert into database
		
		String query="INSERT INTO THREENUMBERSTABLE(fno,sno, tno, max) VALUES("+threeNumbers.getFno()+","+threeNumbers.getSno()+","+threeNumbers.getTno()+","+threeNumbers.getMax()+")";
		  System.out.println("Record inserted succ in sum table");
		  System.out.println(jdbcTemplate == null);
		  jdbcTemplate.update(query);
		
	}

}
