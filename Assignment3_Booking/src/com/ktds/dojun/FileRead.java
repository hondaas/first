package com.ktds.dojun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	private static final String LOG_FOLDER_PATH = "./BookSaves";
	private static final String LOG_FILE_PATH = LOG_FOLDER_PATH + "./bookListFile.txt";
	private static String datam = " ";

	public static void setDatam(String data) {
		data = datam;
	}

	public static String getDatam() {
		return datam;
	}

	public static void start() {
		datam = "";
		try {
			FileReader fr = new FileReader(LOG_FILE_PATH);
			BufferedReader br = new BufferedReader(fr);

			try {
				while (true) {

					String line = null; // 디폴트값
					line = br.readLine();
					if (line == null) {
						break;
					}
					String liness = line + " ";
					datam = datam + liness;
				}
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
