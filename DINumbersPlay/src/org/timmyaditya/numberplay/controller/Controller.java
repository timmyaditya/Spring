package org.timmyaditya.numberplay.controller;
import org.timmyaditya.numberplay.service.Service;

import org.timmyaditya.numberplay.dto.ModelDto;


public class Controller {
	//injecting service in controller
	private Service service;
	public void setService(Service service)
	{
		this.service = service;
	}
	
	public void doOperations(int enteredNumber)
	{
		ModelDto modelDto = new ModelDto();
		modelDto.setEnteredNumber(enteredNumber);
		service.calcDigitSum(modelDto);
		service.calcDigitReverse(modelDto);
		
		System.out.println("Entered Number="+modelDto.getEnteredNumber());
		System.out.println("Sum of digits="+modelDto.getDigitSum());
		System.out.println("Reverse of digits="+modelDto.getDigitReverse());
	}

}
