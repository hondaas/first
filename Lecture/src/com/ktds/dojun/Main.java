package com.ktds.dojun;

public class Main {

	public static void main (String[]args) {
		//외부에서 입력한 값을 반영할 때, 파라미터를 쓴다. 
		
		Teacher teacher = new Teacher();
		Student student = new Student();  // a. student라는 변수의 타입은 Student
		                                  // 레퍼런스 형태
		
		
	// teacher 가 student 에게 teach 한다.
		
	teacher.teach("Oracle DB", student); //student를 실행시키는 것은 teacher의 teach
	                                     // a. student 라는 변수를 ,다음에 넣는다.
	
	//결국 teach만 했더니, 학생이 study를 하는 결과가 나옴.
	
	
	//선생과 학생의 추상적인 존재는 메소드 클래스에 있지만
	//Main에는 선생이 teacher, 학생이 student라는 실체가 반영된다.
	

	
		
	}
	
}
