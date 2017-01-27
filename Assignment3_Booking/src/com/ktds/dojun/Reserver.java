package com.ktds.dojun;

public class Reserver {

	private int money;

	
	
	
	
	
	public Reserver(int money) {
	
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void book(BookSys bookSys) {
		bookSys.bookProcess(money, this);
	}

	public void pay(int money) {
		this.money -= money;
	}

	
	public void currentState() {
		System.out.println("내가 가진 현금 : " + money +"\n\n");
	}


}
