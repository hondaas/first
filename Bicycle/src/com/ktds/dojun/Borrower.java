package com.ktds.dojun;

public class Borrower {

	



	private int bicycles;
	private int money;
	
	public Borrower(int bicycles, int money) {
		super();
		this.bicycles = bicycles;
		this.money = money;
	}

	
	
	
	public int getBicycles() {
		return bicycles;
	}
	public void setBicycles(int bicycles) {
		this.bicycles = bicycles;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	public void borrow(int bicycles, Renter renter) {
		
		renter.rent(bicycles);
		
		this.bicycles += bicycles;
		
		this.money -= (bicycles * renter.getPrice() );
		

		
	}

public String toString() {
		
		String message = String.format("자전거 보유 수 : %d대\n보유 금액 : %d", this.bicycles, this.money);
		
		return message;
		
	}
	
	
	
	
	
	
}
