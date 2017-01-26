package com.ktds.dojun;

public class Renter {
	
	private int stock;
	private int budget;
	private int price;
	

	
	

	
	
	public Renter(int stock, int budget, int price) {
	
		this.stock = stock;
		this.budget = budget;
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getBudget() {
		return budget;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	


	public void rent (int bicycles) {
		
		stock -= bicycles;
		budget += (price*bicycles);
		
		
		
	}
	
public String toString() {
		
		String message = String.format("자전거 보유 수 : %d대\n보유 금액 : %d", this.stock, this.budget);
		
		return message;
		
	}
	
}
