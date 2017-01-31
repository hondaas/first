package com.ktds.dojun;


import com.ktds.dojun.Seller.Seller;

public interface BuyMechanism {

	public void buy(Seller seller);
	
	public void plusEA();
	
	public void payMoney(int money);

	
}
