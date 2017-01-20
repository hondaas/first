
public class MultipleArray {
	
	void printClassTotalScore(int[][] scoresInClasses) {
//		 차원의 수 만큼 대괄호를 만들어준다. (앞이 행, 뒤가 열을 의미)
		
		double totalScore1 = (scoresInClasses[0][0] + scoresInClasses[0][1] + scoresInClasses[0][2])/(scoresInClasses[0].length*1.0);
		
		
		double totalScore2 = (scoresInClasses[1][0] + scoresInClasses[1][1] + scoresInClasses[1][2])/(scoresInClasses[1].length*1.0);
		
		
		double totalScore3 = (scoresInClasses[2][0] + scoresInClasses[2][1] + scoresInClasses[2][2])/(scoresInClasses[2].length*1.0);
		

		
		
		
		
		
		System.out.println("1반 " + totalScore1 + "  " +
				           "2반 " + totalScore2 + "  " +
				           "3반 " + totalScore3);
		
		
		
		
		
	}
	

}
