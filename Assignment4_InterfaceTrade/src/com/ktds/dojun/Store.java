package com.ktds.dojun;

import com.ktds.dojun.Buyer.*;
import com.ktds.dojun.Seller.*;

public class Store {

	public void start() { 
				
		BuyMechanism lyj = new Buyer (0, 500000);
		SellMechanism nym = new Seller (500, 500000);
		
		lyj.buy(nym);
		
		System.out.println(lyj);
		System.out.println(nym);
		
	}

	

	public static void main(String[] args) {

		new Store().start(); //앞으로 메인 클래스를 쓰는 방법!
	}

}
