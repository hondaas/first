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

		if (bob >= 2 && kim >= 2 && tuna >= 1) {
			for (int i = 1; i <= tunaCook; ++i) {
				bob = bob - 2;
				kim = kim - 2;
				tuna--;
			} 
			staff.gettTuna(tunaCook);
			
		}else
			System.out.println("재료가 부족합니다.");

	}

	public void cookCheese(int cheeseCook, Staff staff) {

		if (bob >= 2 && kim >= 2 && cheese >= 1) {
			for (int i = 1; i <= cheeseCook; ++i) {
				bob = bob - 2;
				kim = kim - 2;
				cheese--;
			} 
			staff.gettCheese(cheeseCook);
			
		}else
			System.out.println("재료가 부족합니다.");

	}

	public String toString() {
		String message = String.format("\n[재료 현황]\n 참치 : %d | 치즈 : %d | 김 : %d | 밥 : %d", tuna, cheese, kim, bob);
		return message;
	}
}
