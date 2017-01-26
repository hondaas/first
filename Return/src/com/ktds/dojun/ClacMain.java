package com.ktds.dojun;

public class ClacMain {

	public static void main (String[]args) {
		
		Return cal = new Return();
		cal.printComputeResult();
		cal.printComputeResult(10, 50);
		
		int result = cal.getAndPrintMultiplicationResult(cal.getAndPrintMultiplicationResult(100,50), 7);
		
		//거꾸로 해석해야 함. - "cal. 이하의 메소드 결과가 int result에 할당이 될 것이다."
		
		System.out.println(result);
	}
	
}
