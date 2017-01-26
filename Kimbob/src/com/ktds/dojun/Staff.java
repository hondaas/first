package com.ktds.dojun;

public class Staff {

	private final int TUNAKIMBOB = 1;
	private final int CHEESEKIMBOB = 2;

	private final int TUNA_PRICE = 2500;
	private final int CHEESE_PRICE = 2000;

	private int tunaKList;
	private int cheeseKList;

	private int tunaKStock;
	private int cheeseKStock;

	private int money;

	private int done;

	public Staff(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getTunaKStock() {
		return tunaKStock;
	}

	public void setTunaKStock(int tunaKStock) {
		this.tunaKStock = tunaKStock;
	}

	public int getCheeseKStock() {
		return cheeseKStock;
	}

	public void setCheeseKStock(int cheeseKStock) {
		this.cheeseKStock = cheeseKStock;
	}

	public void setTunaKList(int tunaKList) {
		this.tunaKList = tunaKList;
	}

	public int getTunaKList() {
		return tunaKList;
	}

	public void setCheeseKList(int cheeseKList) {
		this.cheeseKList = cheeseKList;
	}

	public int getCheeseKList() {
		return cheeseKList;
	}

	public void setDone(int done) {
		this.done = done;
	}

	public int getDone() {
		return done;
	}

	public void giveList(Chef chef) {
		chef.cookTuna(tunaKList, this);
		chef.cookCheese(cheeseKList, this);
	}

	public void gettTuna(int tunaDish) {
		this.tunaKStock = tunaDish;
	}

	public void gettCheese(int cheeseDish) {
		this.cheeseKStock = cheeseDish;
	}

	public void receive(int paidMoney, Guest guest) {

		this.money += paidMoney;

		String menu = "";
		int selectedMenu = 0;

		while (true) {
			// 메뉴 출력
			System.out.println("---------------------------------");
			menu = String.format("1. 참치김밥(%d원) : %d개  |  2. 치즈김밥(%d원) : %d개  |  3. 구매 종료", TUNA_PRICE, tunaKStock,
					CHEESE_PRICE, cheeseKStock);
			System.out.println(menu);
			System.out.println("---------------------------------");

			System.out.print("메뉴를 선택하세요 : ");
			// 사용자가 메뉴를 선택한다.
			selectedMenu = guest.selectMenu();

			if (selectedMenu == TUNAKIMBOB) {

				if (paidMoney >= TUNA_PRICE) {
					tunaKList++;

					paidMoney -= TUNA_PRICE;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			}

			else if (selectedMenu == CHEESEKIMBOB) {

				if (paidMoney >= CHEESE_PRICE) {
					cheeseKList++;
					paidMoney -= CHEESE_PRICE;
				}

				else {
					System.out.println("잔액이 부족합니다.");
				}
			}

			else if (selectedMenu == 3)

			{
				guest.getRemainMoney(paidMoney);
				this.money -= paidMoney;

				done = 1;

				break;
			}
		}

	}

	@Override
	public String toString() {
		String message = String.format("\n[staff 일지]\n서빙한 참치김밥 개수 : %d | 서빙한 치즈김밥 개수 : %d\n자산 :%d", tunaKStock, cheeseKStock, money);
		return message;

	}
}