package com.ktds.dojun.Buyer;
import com.ktds.dojun.BuyMechanism;
import com.ktds.dojun.SellMechanism;
import com.ktds.dojun.Seller.*;
import com.ktds.dojun.vo.BasketVO;

public class Buyer implements BuyMechanism {

	private BasketVO basketVO;
	

	public Buyer(int productEA, int money) {
		System.out.println("구매자를 생성합니다!");
		
		
		basketVO = new BasketVO();
		basketVO.setMoney(money);
		basketVO.setProductQuantity(productEA);
		
		
		
		System.out.println(this);

	}
	public void buy(SellMechanism seller){
		seller.sell(this);
		
	}

	@Override
	public void plusEA() {
		basketVO.plusProductQuantity();
		
	}

	@Override
	public void payMoney(int money) {
		basketVO.minusMoney(money);
		this.plusEA();
		
	}


	@Override
	public String toString() {
		
		String message = String.format("구매한 상품 개수 : %d\n구매자가 가진 금액 : %d", basketVO.getProductQuantity(), basketVO.getMoney());
		
		return message;
		
	}
	}




