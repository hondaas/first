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

	public void servedTuna(int Tunas) {

		tunaKStock=Tunas;
	}

	public void servedCheese(int Cheeses) {
		cheeseKStock=Cheeses;
	}

	public void getRemainMoney(int remainMoney) {
		this.money += remainMoney;
	}

	@Override
	public String toString() {
		String message = String.format("\n[맛있게 드세요]\n나온 참지김밥 : %d | 나온 치즈김밥 : %d \n소지금 :%d", tunaKStock, cheeseKStock, money);
		return message;
	}

}