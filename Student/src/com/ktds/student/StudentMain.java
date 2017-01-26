package com.ktds.student;

public class StudentMain {

	public static void main(String[] args) {

		Person kbk = new Person(); // 생성자
		// 메소드에는 반드시 괄호가 들어간다.

		kbk.setName("하하하");
		kbk.setJob("샤샤샤");
		kbk.introduce();

		Person unknown = new Person();

		unknown.introduce();
		
		Person abc = new Person("김도준", "마법사");

		abc.introduce();
		
		
		//null : 일종의 객체

	}
}
