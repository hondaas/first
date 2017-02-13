package com.ktds.dojun;

import java.util.Scanner;

public class BookSys {

	private String[][] seatList = { { "01", "02", "03", "04", "05", "06", "07", "08" },
			{ "09", "10", "11", "12", "13", "14", "15", "16" }, { "17", "18", "19", "20", "21", "22", "23", "24" },
			{ "25", "26", "27", "28", "29", "30", "31", "32" }, { "33", "34", "35", "36", "37", "38", "39", "40" },
			{ "41", "42", "43", "44", "45", "46", "47", "48" }, { "49", "50", "51", "52", "53", "54", "55", "56" },
			{ "57", "58", "59", "60", "61", "62", "63", "64" }, { "65", "66", "67", "68", "69", "70", "71", "72" } };

	private int budget;

	private final int PRICE_N = 8000;
	private final int PRICE_S = 12000;
	private int selectedN;
	private int selectedS;

	public String[][] getSeatList() {
		return seatList;
	}

	public void setSeatList(String[][] seatList) {
		this.seatList = seatList;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public void bookDateRead() {


		FileRead.start();
		String[] readList = FileRead.getDatam().split(" ");

		int q = 0;
		for (int i = 0; i < 9; ++i) {

			for (int j = 0; j < 8; ++j) {
				seatList[i][j] = readList[q];
				q++;
			}
		}

	}

	public void bookProcess(int money, Reserver reserver) {
		FileWriteHelper.makeLogsFolder();
		FileWriteHelper.makeCalculatorLogFile();
		this.bookDateRead();

		Scanner input = new Scanner(System.in);
		System.out.println("상영 영화 : [라라랜드]");
		System.out.println(" ");

		this.seatCount();

		System.out.println(" ");

		System.out.println("관람 인원 수를 선택하세요.");

		int typeQ = input.nextInt();

		System.out.println("----------------------------------------");
		System.out.println("=============[S C R E E N]==============");
		System.out.println("----------------------------------------");
		for (int i = 0; i < 8; ++i) {
			int j = 0;

			System.out.println("[" + seatList[i][j] + "]" + "[" + seatList[i][j + 1] + "]" + "    " + "["
					+ seatList[i][j + 2] + "]" + "[" + seatList[i][j + 3] + "]" + "[" + seatList[i][j + 4] + "]" + "["
					+ seatList[i][j + 5] + "]" + "    " + "[" + seatList[i][j + 6] + "]" + "[" + seatList[i][j + 7]
					+ "]");
		}
		System.out.println("______________ SWEET BOX _______________");
		System.out.println("[" + seatList[8][0] + "]" + "[" + seatList[8][1] + "]" + "    " + "[" + seatList[8][2] + "]"
				+ "[" + seatList[8][3] + "]" + "[" + seatList[8][4] + "]" + "[" + seatList[8][5] + "]" + "    " + "["
				+ seatList[8][6] + "]" + "[" + seatList[8][7] + "]");

		for (int q = 0; q < typeQ; q++) {
			Scanner input2 = new Scanner(System.in);
			String typeSeat = input2.nextLine();

			for (int i = 0; i < 9; ++i) {

				for (int j = 0; j < 8; ++j) {

					String st = seatList[i][j];

					if (st.equals(typeSeat)) {

						if (i == 8) {

							seatList[i][j] = "■■";
							selectedS++;
							this.currentState();

						} else {

							seatList[i][j] = "■■";
							selectedN++;
							this.currentState();

						}
					}

					else {
					}

				}
			}
		}

		int nTotal = PRICE_N * selectedN;
		int sTotal = PRICE_S * selectedS;
		System.out.println(" ");
		System.out.println("일반석 : " + selectedN + " 석");
		System.out.println("SweetBox : " + selectedS + " 석");
		System.out.println(" ");
		System.out.println("총 금액은  [ " + (sTotal + nTotal) + " 원 ] 입니다.");
		System.out.println("----------------------------------------------");
		System.out.println("결제 방법을 선택해 주세요.");
		System.out.println("  [ 1.카드   2.현금 ]");

		Scanner input3 = new Scanner(System.in);
		int payMethod = input3.nextInt();

		if (payMethod == 1) {
			System.out.println("카드 결제를 요청합니다.");
		}

		else if (payMethod == 2) {
			System.out.println("금액을 투입해 주세요.");
			int waitInsert = sTotal + nTotal;

			while (true) {
				Scanner input4 = new Scanner(System.in);
				int insertCash = input4.nextInt();

				if (insertCash < waitInsert) {
					waitInsert -= insertCash;
					System.out.println("지불해야 할 금액" + waitInsert);
				}

				else {
					reserver.pay(sTotal + nTotal);

					budget += sTotal + nTotal;

					break;
				}
			}

		}

		FileWriteHelper.deleteLogFile();

		FileWriteHelper.makeCalculatorLogFile();

		this.save();
		System.out.println("결제가 완료되었습니다. \n이용해 주셔서 감사합니다.");
		reserver.currentState();

	}

	// String[] strPoints = strPoint.split(" ");

	// int numberP1 = Integer.parseInt(strPoints[0]);
	// int numberP2 = Integer.parseInt(strPoints[1]);
	public void currentState() {
		System.out.println("----------------------------------------");
		System.out.println("=============[S C R E E N]==============");
		System.out.println("----------------------------------------");
		for (int i = 0; i < 8; ++i) {
			int j = 0;

			System.out.println("[" + seatList[i][j] + "]" + "[" + seatList[i][j + 1] + "]" + "    " + "["
					+ seatList[i][j + 2] + "]" + "[" + seatList[i][j + 3] + "]" + "[" + seatList[i][j + 4] + "]" + "["
					+ seatList[i][j + 5] + "]" + "    " + "[" + seatList[i][j + 6] + "]" + "[" + seatList[i][j + 7]
					+ "]");
		}
		System.out.println("______________ SWEET BOX _______________");
		System.out.println("[" + seatList[8][0] + "]" + "[" + seatList[8][1] + "]" + "    " + "[" + seatList[8][2] + "]"
				+ "[" + seatList[8][3] + "]" + "[" + seatList[8][4] + "]" + "[" + seatList[8][5] + "]" + "    " + "["
				+ seatList[8][6] + "]" + "[" + seatList[8][7] + "]");

	}

	public void save() {

		for (int i = 0; i < 9; ++i) {

			for (int j = 0; j < 8; ++j) {

				String message = seatList[i][j];

				FileWriteHelper.writeLog(message);
			}
		}

	}

	public void seatCount() {
		int count = 0;

		for (int i = 0; i < 9; ++i) {

			for (int j = 0; j < 8; ++j) {

				if (seatList[i][j].equals("■■")) {
					++count;
				}

			}
		}

		System.out.println("남은 좌석 : " + (72 - count) + " / 72");
	}
}
