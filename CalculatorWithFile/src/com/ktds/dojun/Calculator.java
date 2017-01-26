package com.ktds.dojun;

import com.ktds.dojun.helper.FileWriteHelper;

public class Calculator {
	
	public static void start() {
		
		
		int result = 10 + 70;
		
		String message = String.format("%d + %d = %d", 10, 70, result);
		System.out.println(message);
		
		FileWriteHelper fileWriteHelper = new FileWriteHelper();
	    fileWriteHelper.makeLogsFolder();
	    
		
		
	}
	public static void main (String[]args){
		
		FileWriteHelper a = new FileWriteHelper();
		a.

		
		new Calculator().start();
	}

}
