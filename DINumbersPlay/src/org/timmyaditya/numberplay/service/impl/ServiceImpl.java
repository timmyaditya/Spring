package org.timmyaditya.numberplay.service.impl;

import org.timmyaditya.numberplay.dao.ReverseDao;
import org.timmyaditya.numberplay.dao.SumDao;
import org.timmyaditya.numberplay.dto.ModelDto;
import org.timmyaditya.numberplay.model.DigitReverse;
import org.timmyaditya.numberplay.model.DigitSum;
import org.timmyaditya.numberplay.service.Service;

public class ServiceImpl implements Service {

	//injecting Dao layer in service
	private SumDao sumDao;
	private ReverseDao reverseDao;
	public void setSumDao(SumDao sumDao)
	{
		this.sumDao = sumDao;
	}
	public void setReverseDao(ReverseDao reverseDao)
	{
		this.reverseDao = reverseDao;
	}
	
	@Override
	public void calcDigitSum(ModelDto modelDto) {
		int enteredNumber = modelDto.getEnteredNumber();
		int digitSum = getSumOfDigits(enteredNumber);
		modelDto.setDigitSum(digitSum);
		
		//adding into database table of digitsum
		DigitSum ds = new DigitSum();
		ds.setEnteredNumber(enteredNumber);
		ds.setSumOfDigits(digitSum);
		
		sumDao.insertNumber(ds);
	}

	@Override
	public void calcDigitReverse(ModelDto modelDto) {
		int enteredNumber = modelDto.getEnteredNumber();
		int digitReverse = getReverseOfDigits(enteredNumber);
		modelDto.setDigitReverse(digitReverse);
		
		DigitReverse dr = new DigitReverse();
		dr.setEnteredNumber(enteredNumber);
		dr.setReverseOfDigits(digitReverse);
		
		reverseDao.insertNumbers(dr);
	}
	
	private int getSumOfDigits(int enteredNumber)
	{
		int sum=0;
		while(enteredNumber!=0)
		{
			int temp = enteredNumber%10;
			sum = sum + temp;
			enteredNumber = enteredNumber/10;
		}
		return sum;
	}
	private int getReverseOfDigits(int enteredNumber)
	{
		int rev=0;
		while(enteredNumber!=0)
		{
			int temp = enteredNumber%10;
			rev=rev*10+temp;
			enteredNumber = enteredNumber/10;
		}
		return rev;
	}
	

}
