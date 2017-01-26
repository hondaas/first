package com.ktds.dojun;

public class Stand {

	private String button = "스위치";
	private String lamp = "전구";
	private String elec = "전기";
// instance field에 대해서 setter 생성
	
	int light = 0;

	public void on() {// private같은 제한자가 없다면 default 값이다.
		System.out.printf("%s가 들어옵니다.\n", elec);

		System.out.println("스탠드를 켭니다.");
		light = 5;

		String message = String.format("%s를 눌러서 %s를 켭니다.", button, lamp);
		System.out.println(message);

		message = String.format("밝기는 %d입니다.", light);
		System.out.println(message);

	}

	void off() {
		light = 0;
	}

	void lightbalanceup() {

		if (light > 0) {

			light++;
			System.out.printf("밝기 %s", light);

		}

		else {
			System.out.println("전원꺼짐");
		}
		light++;
		System.out.printf("밝기 %s.", light);
	}

	void lightbalancedown() {
		if (light > 0) {

			light--;
			System.out.printf("밝기 %s", light);

		}

		else {
			System.out.println("전원꺼짐");

		}

	}
}
