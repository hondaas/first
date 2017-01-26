package com.ktds.dojun;

public class ArmyMain {

	public static void main(String[] args) {

		// 군인 객체를 만들어주는 클래스 (객체)
		Army army = new Army();
		
		//String name="인병주";
		
		String name = new String("인병주");
		
		Person kdj = army.makeArmy("김도준"); //Army 클래스의 army 매소드에 
		System.out.println(kdj.getName());
		System.out.println(kdj.getJob());
		
		
		
	}

}
