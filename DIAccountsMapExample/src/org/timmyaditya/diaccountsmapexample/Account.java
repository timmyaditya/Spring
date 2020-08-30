package org.timmyaditya.diaccountsmapexample;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Account {
	private int accNo;
	private String holderName;
	private Map<Loan, InstallmentList> loanWiseInstallments;
	public Account(int accNo, String holderName, Map<Loan, InstallmentList> loanWiseInstallments) {
		super();
		this.accNo = accNo;
		this.holderName = holderName;
		this.loanWiseInstallments = loanWiseInstallments;
	}
	
	public void displayAccount()
	{
		System.out.println("***********Account*************");
		
		System.out.println("acc No - " + accNo + "Holder Name - " + holderName );
		
		System.out.println("Map Display:-");
		
		Set<Entry<Loan, InstallmentList>> set = loanWiseInstallments.entrySet();
		Iterator<Entry<Loan, InstallmentList>> it = set.iterator();
		
		Entry<Loan, InstallmentList> e = null;
		Loan l = null;
		InstallmentList inst = null;
		
		while(it.hasNext())
		{
			e = it.next();
			l = e.getKey();
			inst = e.getValue();
			
			l.displayLoan();
			inst.displayInstList();
		}
		
		
		System.out.println("***********Account*************");
	}

}
