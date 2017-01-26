package com.ktds.dojun;

public class Main {
	
	public static void main (String[]args){
		
		OilBank oilBank = new OilBank(); // 파라미터를 받아주는 생성자가 없으므로 쓰지 않는다.
		
		oilBank.setOilStock(5000);
		oilBank.setBudget(0);
		oilBank.setPricePerLiter(1480);
		
		Car car = new Car("크라이슬러", 50, 1000000);
		
		
		System.out.println(oilBank);
		oilBank.fill(car);
		
		System.out.println("주유소");
		System.out.println(oilBank.getOilStock());
		System.out.println(oilBank.getBudget());
		
		System.out.println("자동차");
		System.out.println(car.getModelName());
		System.out.println(car.getOilTankVolume());
		System.out.println(car.getMoney());
		
		
	} 

}
