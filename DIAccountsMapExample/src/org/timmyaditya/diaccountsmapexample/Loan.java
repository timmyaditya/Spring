package org.timmyaditya.diaccountsmapexample;

public class Loan {
	private int loanNo;
	private String loanName;
	private int loanAmt;
	public Loan(int loanNo, String loanName, int loanAmt) {
		super();
		this.loanNo = loanNo;
		this.loanName = loanName;
		this.loanAmt = loanAmt;
	}
	
	public void displayLoan()
	{
		System.out.println("********Loan**********");
		
		System.out.println("Loan No - "+ loanNo + " Loan Name - " + loanName + " Loan Amt - "+ loanAmt);
		
		System.out.println("********Loan**********");
	}

}
