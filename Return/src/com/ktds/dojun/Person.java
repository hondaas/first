package com.ktds.dojun;

public class Person {

	private String name;
	private String job;

	// 기본 생성자
	public Person() {
		System.out.println("person 생성자 실행됨!");
		//

	}

	public Person(String name, String job) {
		System.out.println("person 생성자 실행됨!");
		// 생성자마다 매번 실행될 것임
		// 추가적인 기본 작업을 해줄때 만들어주면 된다.
		// 맴버변수 값을 초기화해주는 역할
		// name = "익명";
		// job= "알 수 없음";
		setName(name);
		setJob(job);
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setJob(String job) {

		this.job = job;
	}

	/*
	 * 게터를 만드는 방법
	 * 
	 * public 가져올_맴버_변수_타입 get가져올_맴버변수_명(); return 가져올_맴버변수
	 */
	public String getName() {
		return this.name;
	}

	public String getJob()  {
		return this.job;
	}

	public void introduce() {

		String message = String.format("dlfma : %s,  직업 : %s", name, job);
		System.out.println(message);
	}

}
