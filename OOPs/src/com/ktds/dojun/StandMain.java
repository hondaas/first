package com.ktds.dojun;

public class StandMain {

	public static void main(String[] args) {

		Stand stand = new Stand();
		
		
		stand.light =10
				
				// 인스턴스 빌드에 값을 주면 켜진 것으로 인식
				// 이런 일이 일어나지 않도록 인스턴스 빌드는 무조건 보호해야 함
				
				
		stand.lightbalanceup();
		stand.lightbalancedown();
		
		stand.on();
		
		stand.lightbalanceup();
		stand.lightbalancedown();
		
		stand.off();
	}
}
