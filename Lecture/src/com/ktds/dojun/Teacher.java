package com.ktds.dojun;

public class Teacher {

	public void teach(String subject, Student student) { //a. student라는 변수의 타입은 Student
		                                                 // 마치 subject변수의 타입이 String인것 처럼.
		
		System.out.println(subject + "를 가르칩니다.");
		
		student.study(subject);
		
		
		
		
		
	}
}
