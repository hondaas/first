package com.ktds.dojun;

public class Army {

	public final String JOB = "직업군인";

	public Person makeArmy(String name) { //makeArm라는 Person 레퍼런스 변수의 메소드
		// 레퍼런스 타입을 반환하는 방법!

		// 외부에서 전달받은 이름을 이용해 person 객체를 생성한다.

		Person army = new Person(name, "직업군인");
//위의 Person은 변수(레퍼런스 형태의.. int 같은 프리미티브가 아닌)
		
		return army;
	}

	// 생성된 Person 객체를 반환한다.

}
