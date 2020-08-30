package org.timmyaditya.threenumber.controller;

import org.timmyaditya.threenumber.dto.ThreeNumbersDto;
import org.timmyaditya.threenumber.service.ThreeNumbersService;

public class Controller {
	//inject service
	private ThreeNumbersService threeNumbersService;
	public void setThreeNumbersService(ThreeNumbersService threeNumbersSrevice)
	{
		this.threeNumbersService = threeNumbersSrevice;
	}
	
	public void doCalc(int fno, int sno , int tno)
	{
		ThreeNumbersDto threeNumbersDto = new ThreeNumbersDto();
		threeNumbersDto.setFno(fno);
		threeNumbersDto.setSno(sno);
		threeNumbersDto.setTno(tno);
		threeNumbersService.operations(threeNumbersDto);
		
		System.out.println("Min = "+ threeNumbersDto.getMin()+ "Max = " + threeNumbersDto.getMax());
	}

}
