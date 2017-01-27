package com.ktds.dojun;

public class Admin {

	private static String[][] seatList = { { "01", "02", "03", "04", "05", "06", "07", "08" },
			{ "09", "10", "11", "12", "13", "14", "15", "16" }, { "17", "18", "19", "20", "21", "22", "23", "24" },
			{ "25", "26", "27", "28", "29", "30", "31", "32" }, { "33", "34", "35", "36", "37", "38", "39", "40" },
			{ "41", "42", "43", "44", "45", "46", "47", "48" }, { "49", "50", "51", "52", "53", "54", "55", "56" },
			{ "57", "58", "59", "60", "61", "62", "63", "64" }, { "65", "66", "67", "68", "69", "70", "71", "72" } };
	
public static void reset() {
		
	FileWriteHelper.deleteLogFile();
	FileWriteHelper.makeCalculatorLogFile();
	
		for (int i = 0; i < 9; ++i) {

			for (int j = 0; j < 8; ++j) {

				String message = seatList[i][j];
				
				FileWriteHelper.writeLog(message);}}
		
		
		
		
		
	}

}
