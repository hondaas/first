package com.ktds.dojun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().start();
	}
	
	public void start() {
		Admin admin = new Admin();
		BookSys bookSys = new BookSys();
		Reserver reserver = new Reserver(30000);

		
		while(true){
		System.out.println("[모드를 선택하세요.]");
		System.out.println("1.예매 모드   2.관리자 모드   3.종료");
		Scanner input = new Scanner(System.in);

		int select = input.nextInt();

		if (select == 1) {

			reserver.book(bookSys);
		} else if (select == 2) {
			System.out.println("\n좌석을 리셋합니다...\n");
			admin.reset();
		}else if (select==3){
			
			break;
		}
		
		
		}
		

	}

	

}