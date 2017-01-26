package com.ktds.dojun;

public class Main {
	
	public static void main (String[]args) {
		
		Borrower borrower = new Borrower(1,6000);
		Renter renter =new Renter(100,50000,5000);
		
		
		
		borrower.borrow(1,renter);
		
		System.out.println(borrower);
		System.out.println(renter);
        		
		
		
	}

}
