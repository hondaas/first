package com.ktsd.dojun.Make;

import java.io.File;

public class MakeDirectories {

	public void start() {

		String directoryPath = "D:\\game";

		// 폴더 만들기
		// (폴더를 만들든 파일을 만들던 File이라는 클래스는 반드시 필요하다.)

		File game = new File(directoryPath);

		if (!game.exists()) {
			game.mkdir();
		}

		// makedirectory

	}

	public static void main(String[] args) {

		new MakeDirectories().start();
	}

}
