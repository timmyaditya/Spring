package org.timmyaditya.diaccountsmapexample;

public class Installments {
	private int instNo;
	private String instDate;
	private int instAmt;
	public Installments(int instNo, String instDate, int instAmt) {
		super();
		this.instNo = instNo;
		this.instDate = instDate;
		this.instAmt = instAmt;
	}
	
	public void displayInstallements()
	{
		System.out.println("**********Installments**********");
		
		System.out.println("Installment No - " + instNo + "Installment Date - "+ instDate + "Installment Amt - "+ instAmt);
		
		System.out.println("********************************");
	}

}
