package com.ktsd.dojun.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	
	public void start() { 
		
		String filePath = "D:\\makeFile.txt";
		
		try {//FileWriter와 BufferedWiter의 역할이 다르다.
			FileWriter fileWriter = new FileWriter( filePath, true );
			//파일에 데이터를 작성할 수 있도록 지원해주는 클래스
			//true라면, 계속 누적 작성, false는 기존 데이터 지우고 새로 쓴다.
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			// 메모리에 있는 내용을 손실시키지 않고 파일에 쓰도록 지원해주는 클래스
			// 메모리의 데이터를 FileWriter에게 전달해주는 역할
				
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			//작성하려는 데이터를 메모리에 적절히 적재 시킬 수 있도록 지원해주는 클래스
			// 데이터를 BufferedWriter에게 전달해주는 역할
			
			printWriter.println("파일에 작성합니다.");
			//파일에 데이터를 작성합니다.
			
			printWriter.close();
			bufferedWriter.close();
			fileWriter.close();
			//역순으로 close 해주어야 함. 순서 바뀌면 안됨
			
			
			//Date가 흘러가는 곳을 Stream 이라고 한다.
			//데이터가 도달했다면, close로 막아주어서 메모리 leak이 발생되지 않게 해야 함.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public static void main (String[]args) {
	new FileWrite().start();
	
}
}
