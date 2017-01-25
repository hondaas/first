package com.ktds.dojun;

public class Chef {

	private int tuna;
	private int kim;
	private int cheese;
	private int bob;

	public Chef(int tuna, int kim, int cheese, int bob) {

		this.tuna = tuna;
		this.kim = kim;
		this.cheese = cheese;
		this.bob = bob;
	}

	public int getTuna() {
		return tuna;
	}

	public void setTuna(int tuna) {
		this.tuna = tuna;
	}

	public int getKim() {
		return kim;
	}

	public void setKim(int kim) {
		this.kim = kim;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}

	public int getBob() {
		return bob;
	}

	public void setBob(int bob) {
		this.bob = bob;
	}

	public void cookTuna(int tunaCook, Staff staff) {

		for (int i = 1; i <= tunaCook; ++i) {

			bob -=  2; kim -=  2;
			tuna--;
		}

		if (bob + kim + tuna < 0) 	{System.out.println("재료가 부족합니다.");}
		 else {	staff.gettTuna(tunaCook);}

		

	}

	public void cookCheese(int cheeseCook, Staff staff) {

		for (int i = 1; i <= cheeseCook; ++i) {
			bob = bob - 2;
			kim = kim - 2;
			cheese--;
		}
		if (bob + kim + tuna < 0) {

			System.out.println("재료가 부족합니다.");
		} else {

			staff.gettCheese(cheeseCook);

		}

	}
	
	public String toString() {
		String message = String.format("[재료 현황]\n 참치 : %d | 치즈 : %d | 김 : %d | 밥 : %d", tuna, cheese, kim, bob);
		return message;}
}
