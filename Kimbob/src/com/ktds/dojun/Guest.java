package com.ktds.dojun;

import java.util.Scanner;

public class Guest {

	private int money;
	private int tunaKStock;
	private int cheeseKStock;

	public Guest(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void order(Staff staff, int paidMoney) {
		this.money -= paidMoney;
		staff.receive(paidMoney, this);
	}

	public int selectMenu() {
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		return menu;
	}

	public void servedTuna() {

		tunaKStock++;
	}

	public void servedCheese() {
		cheeseKStock++;
	}

	public void getRemainMoney(int remainMoney) {
		this.money += remainMoney;
	}

	@Override
	public String toString() {
		String message = String.format("나온 참지김밥 : %d | 나온 치즈김밥 : %d \n잔액 :%d", tunaKStock, cheeseKStock, money);
		return message;
	}

}