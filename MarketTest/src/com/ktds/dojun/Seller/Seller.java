package com.ktds.dojun.Seller;
import com.ktds.dojun.Buyer.*;
public class Seller {

	private final int PRICE = 2500; // 상수에 대해서는 getter와 setter를 만들지 않는다.
	private int money;
	private int productEA;
	
	public Seller(int productEA, int money) {
		System.out.println("판매자를 생성합니다!");
		
		
		setProductEA(productEA);
		setMoney(money);
		
		System.out.println(this);
		
	}
	
	public void setProductEA(int productEA) {
		this.productEA = productEA;
	}

	public int getProductEA() {
		return this.productEA;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return this.money;
	}
	
	public void sell(Buyer buyer) {
		
		
		this.productEA--;
		// 구매자는 돈을 지불한다.
		buyer.pay(PRICE);
		
		this.money+=PRICE;
		}
	
	public boolean isSoldOut() {
		boolean isSoldOut = this.productEA ==0;
		return isSoldOut;
	}
	
	public String toString() {
String message = String.format("판매한 상품 개수 : %d\n판매자가 가진 금액 : %d", this.productEA, this.money);
		
		return message;
		
	}
	
	

}
