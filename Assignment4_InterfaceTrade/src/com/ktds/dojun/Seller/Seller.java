package com.ktds.dojun.Seller;


import com.ktds.dojun.SellMechanism;
import com.ktds.dojun.Buyer.*;
import com.ktds.dojun.vo.BasketVO;

public class Seller implements SellMechanism {

	private final int PRICE = 2500; // 상수에 대해서는 getter와 setter를 만들지 않는다.
	private BasketVO basketVO;

	public Seller(int productEA, int money) {
		System.out.println("판매자를 생성합니다!");

		basketVO = new BasketVO();
		basketVO.setMoney(money);
		basketVO.setProductQuantity(productEA);

		System.out.println(this);

	}

	@Override
	public void sell(Buyer buyer) {
		if (!isSoldOut()) {

			buyer.payMoney(PRICE);
			this.minusEA();
			this.receiveMoney();

		}
	}

	@Override
	public void minusEA() {
		basketVO.minusProductQuantity();
	}

	@Override
	public void receiveMoney() {
		basketVO.plusMoney(PRICE);
	}

	public boolean isSoldOut() {
		boolean isSoldOut = basketVO.getProductQuantity() == 0;
		return isSoldOut;
	}

	public String toString() {
		String message = String.format("판매한 상품 개수 : %d\n판매자가 가진 금액 : %d", basketVO.getProductQuantity(),
				basketVO.getMoney());

		return message;

	}
}
