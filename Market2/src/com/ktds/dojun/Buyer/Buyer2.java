package com.ktds.dojun.Buyer;

public class Buyer2 {
	
	private String[] drinks = { "콜라", "사이다", "환타" };
	
	private String drink;
	
	private int money;
	private int price ;
	private int change;
	public Buyer2 (String drink, int money) {
		
	
System.out.println("구매자를 생성합니다!");
		
		
		setDrink(drink);
		setMoney(money);
	}
	
		public void setDrink (String drink) {
			this.drink = drink;
		}

		public String getDrink() {
			return this.drink;
		}
		
		public void setMoney (int money) {
			this.money = money;
		}

		public int getMoney() {
			return this.money;
		}
		
		public void select(String drink) {
			
			if (drink.equals(drinks[0])) {
				this.drink = drinks[0];
			}else if (drink.equals(drinks[1])) {
				this.drink = drinks[1];
			}else if (drink.equals(drinks[2])) {
				this.drink = drinks[2];
			}}
			
		
		public void pay(int money) {
			this.money = money;
		}
		
		public String toString() {
			
			String message = String.format("구매한 음료 : %s\n 지불한 돈 : %d", this.drink, this.money);
			
			return message;
		
			
		}}


