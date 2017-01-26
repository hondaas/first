package com.ktds.dojun;

import com.ktds.dojun.Buyer.*;
import com.ktds.dojun.Seller.*;

public class Store {

	public void start() { //의존도를 구현해야 한다.
		
		/*Buyer ljs = new Buyer (0,5000000);
		Buyer jgu = ljs;
		
		// 둘의 메모리는 다르다.
		// 레퍼런스는 같은 메모리 주소를 갖고 있기 때문에, 하나가 바뀌면 서로 할당된 녀석 역시 바뀐다.
		// 이는 프리미티브 타입과 다른 점. 프리미티브 타입은 할당된 녀석따로 오리지날 따로임.
		ljs.buy();
		
		System.out.println(ljs);
		System.out.println(jgu);*/
				
		Buyer lyj = new Buyer (0, 500000);
		Seller nym = new Seller (500, 500000);
		
		lyj.buy(nym);
		
		System.out.println(lyj);
		System.out.println(nym);
		
		
		
		
	}

	/*	System.out.println("장터에 오신것을 환영합니디.");

		Buyer kdj = new Buyer(0, 500000);
		Seller kkb = new Seller(100, 500000);
		
		System.out.println("바이어 : 상품 좀 살게요. 1개 주세요.");
		kkb.sell();
		kdj.buy();
		System.out.println("셀러 : 2500원 입니다.");
		kdj.pay(2500);

		System.out.println(kkb);
		System.out.println(kdj);
	}*/

	// 구매자 판매자
	// 장터(main)

	// 구매자 기능 : 구매하기, 지불하기
	// 속성 : 상품개수(+1), 돈

	// 판매자 기능 : 판매하기, 재고 파악하기
	// 속성 : 돈, 상품개수, 가격

	// 장터 속성: 구매자, 판매자
	// 장터 기능 : Main (중계)

	public static void main(String[] args) {

		new Store().start(); //앞으로 메인 클래스를 쓰는 방법!
	}

}
