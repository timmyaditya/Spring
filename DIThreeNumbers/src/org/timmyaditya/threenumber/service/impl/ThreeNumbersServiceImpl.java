package org.timmyaditya.threenumber.service.impl;

import java.util.ArrayList;
import java.util.Collections;

import org.timmyaditya.threenumber.dao.ThreeNumbersDao;
import org.timmyaditya.threenumber.dto.ThreeNumbersDto;
import org.timmyaditya.threenumber.model.ThreeNumbers;
import org.timmyaditya.threenumber.service.ThreeNumbersService;

public class ThreeNumbersServiceImpl implements ThreeNumbersService{
	
	//injecting the dao layer
	private ThreeNumbersDao threeNumbersDao;
	public void setThreeNumbersDao(ThreeNumbersDao threeNumbersDao)
	{
		this.threeNumbersDao = threeNumbersDao;
	}

	@Override
	public void operations(ThreeNumbersDto threeNumbersDto) {
		int fno = threeNumbersDto.getFno();
		int sno = threeNumbersDto.getSno();
		int tno = threeNumbersDto.getTno();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(fno);
		nums.add(sno);
		nums.add(tno);
		
		Collections.sort(nums);
		int min = nums.get(0);
		int max = nums.get(nums.size()-1);
		
		threeNumbersDto.setMax(max);
		threeNumbersDto.setMin(min);
			
		ThreeNumbers threeNumbers = new ThreeNumbers();
		threeNumbers.setFno(fno);
		threeNumbers.setSno(sno);
		threeNumbers.setTno(tno);
		threeNumbers.setMax(max);
		
		threeNumbersDao.insertNumber(threeNumbers);
	}

}
