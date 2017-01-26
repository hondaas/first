package com.ktds.student;

public class Student {

	private String name = "김도준";
	private String schoolName = "경희대학교";
	private String major = "무역학";

	int grade = 1;

	int score = 90;

	// instance field에 대해서 setter 생성
	// 세터 만드는 형식은 정해져있음 ...

	// "public void set멤버변수명(맴버면수타입,맴버변수명)"
	// "this.맴버변수명 = 맴버변수명;"
	// -> 셋터를 만드는 폼(실무에서 꼭 활용됨)

	public void setName(String name) {

		if (name.length() == 3) {

			this.name = name;
		}
	}

	public void setSchoolName(String schoolName) {

		this.schoolName = schoolName;
	}

	public void setMajor(String major) {

		this.major = major;
	}
	
	public void setGrade(int grade) {

		this.grade = grade;
	}
	public void setScore(int score) {

		this.score = score;
	}


	public void intro() {

		System.out.println("제 이름은 " + name + " 입니다.");
		System.out.println("학교는 " + schoolName + " 입니다.");
		System.out.println("전공은 " + major + " 입니다.");
		System.out.println("학년은 " + grade + "학년 입니다.");

	}

	public void study() {
		++score;

		System.out.println("실력이 향상됩니다.");
	}

	public void test() {

		System.out.printf("시험 결과는 %d 입니다.", score);
	}

}
