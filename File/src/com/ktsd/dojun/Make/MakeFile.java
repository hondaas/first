package com.ktsd.dojun.Make;

import java.io.File;
import java.io.IOException;

public class MakeFile {

	public void start() {
		
		String filepath = "./makeFile1.txt";
	
		File textFile = new File(filepath);//파일을 실제로 만들어 주는 것
		
		try {
			//파일을 실제 저장소에 생성한다.
			textFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block m,
			e.printStackTrace();
		} 

		
	}
	public static void main(String[] args){
		new MakeFile().start();
		
		
	}
	
	
	
}
