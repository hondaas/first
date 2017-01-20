
public class CalculatorMain {

	
	public static void main(String[]args) {
		
		
		double[] points = {100, 100, 100};
		
		ArayCalculator ac = new ArayCalculator();
		
		ac.calculator(points);
		
		String strPoint = "4.5256254";
		String[] strPoints = strPoint.split("2");
		// strPoint를 띄어쓰기 기준으로 분류, 배열
		
		
		double numberOne =Double.parseDouble( strPoints[0] );
		int numberTwo = Integer.parseInt( strPoints[1] );
		int numberThree =Integer.parseInt( strPoints[2] );
	
		
		double[] points2 = {numberOne, numberTwo, numberThree}; 
		
		ac.calculator(points2);
		
		
		
	}
	
}
