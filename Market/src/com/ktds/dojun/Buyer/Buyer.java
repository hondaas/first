package com.ktds.dojun.Buyer;
import com.ktds.dojun.Seller.*;
/**
 * 
 * Seller 에게 상품을 구매하고 금액을 Seller 에게 지불한다.
 * 
 * @author Admin
 *
 */
public class Buyer {
	/**
	 * 상품개수
	 */
	private int productEA;
	/**
	 * 구매자가 가진 금액
	 */
	private int money;

	public Buyer(int productEA, int money) {
		System.out.println("구매자를 생성합니다!");
		
		//초기값 세팅
		setProductEA(productEA);
		setMoney(money);
		
		//현황 출력하기
		
		System.out.println(this);
		//toString이 호출됨. 오라클에서 미리 구현해놓았기 때문. 
		// Object 는 객체를 대표하는 변수
	}
	
	/**
	 * 상품개 수 돈을 초기화 또는 갱신함
	 * 
	 * @return
	 */
	public void setProductEA(int productEA) {
		this.productEA = productEA; // this.productEA(파란색 : 원래 디폴트값인 0에) 에 인풋값을 넣어준다.
	}
//개수 반환
	public int getProductEA() {
		return this.productEA;
	}

	
	/**
	 * 구매자의 가진 돈을 초기화 또는 갱신함
	 * 
	 * @return
	 */
	public void setMoney(int money) {
		this.money = money;
	}
// 가격 반환
	public int getMoney() {
		return this.money;
	}

	public void buy(Seller seller) {
		seller.sell(this);
		//nym이 전달되었음. (lyj과 같은 메모리를 공유 )
		//this는 lyj
		this.productEA++;
	}

	public void pay(int money) {
		this.money -= money;
	}
	/**
	 * 구매자 현황 파악하기
	 */
	@Override
	public String toString() {
		
		String message = String.format("구매한 상품 개수 : %d\n구매자가 가진 금액 : %d", this.productEA, this.money);
		
		return message;
		
	}

}
