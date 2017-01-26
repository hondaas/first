package com.ktds.dojun.Seller;

public class Seller2 {
	
	private String[] drinks = { "콜라", "사이다", "환타" };
	private int[] leftOver = { 0, 0, 0 };
	private String drink;
	
	private int money;
	private int price ;
	private int change;
	
	public Seller2 (int[] leftOver = { 0, 0, 0 }, int money) {
		
	
System.out.println("판매자를 생성합니다!");
		
		
		
		
		setleftOver(leftOver);
		setMoney(money);
	}
	
		public void setleftOver (int leftOver) {
			this.leftOver = leftOver;
			
		}

		public String getleftOver () {
			return this.leftOver;
		}
		
		public void setMoney (int money) {
			this.money = money;
		}

		public int getMoney() {
			return this.money;
		}
		
		public void select(String drink) {
			
			if (drink.equals(drinks[1])) {
				this.price = 1000;
			}else if (drink.equals(drinks[2])) {
				this.price = 1200;
			}else if (drink.equals(drinks[3])) {
				this.price = 1500;
			}}
			
		public void cal(int money) {
				
		    this.money = money-this.price;
			
			}
		
		public String toString() {
			
			String message = String.format("재고 : %s\n 거슬러 준 돈 : %d", this.leftOver, this.money);
			
			return message;
		
			
		}}


