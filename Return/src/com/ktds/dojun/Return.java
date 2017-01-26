package com.ktds.dojun;

public class Return {
	
	public void printComputeResult() {
		
		int result = 1 + 1 ;
		System.out.println(result);
	
	}
	/**
	 * printComputeResult method over loading
	 * 메소드의 이름은 같지만 파라미터의 종류나 개수가 다른 메소드
	 * @param numberOne
	 * @param numberTwo
	 */
	
public void printComputeResult (int numberOne, int numberTwo){
	int result = numberOne + numberTwo;
	System.out.println(result);
	
	
}
public int getAndPrintMultiplicationResult (int numberOne, int numberTwo) {
	int result = numberOne * numberTwo;
	
	return result;
}
}
