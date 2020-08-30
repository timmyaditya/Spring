package org.timmyaditya.diaccountsmapexample;

import java.util.List;

public class InstallmentList {
	private List<Installments> instList;

	public InstallmentList(List<Installments> instList) {
		super();
		this.instList = instList;
	}
	
	public void displayInstList()
	{
		System.out.println("*********Installment List**********");
		
		for( int i=0; i<instList.size(); i++)
		{
			Installments inst = instList.get(i);
			inst.displayInstallements();
		}
		
		System.out.println("***********************************");
	}

}
