package com.ktsd.dojun.Make;

import java.io.File;

public class MakeDirectory {
	
	public void start() {
		
		String directoryPath = "D:\\game\\mobile\\pokemon\\go";
		
		//폴더 만들기
        //(폴더를 만들든 파일을 만들던 File이라는 클래스는 반드시 필요하다.)	
		
		File game = new File(directoryPath);
		
		game.mkdirs();   //mkdirs 까지 적어주어야 여러개의 디렉토리를 생성한다.
		
		
		
	}
	
	
	
	public static void main (String[]args) {
		
		new MakeDirectory().start();
	}
	
	

}
