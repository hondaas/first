package test1;

public class One {

	int a = 100;
	int b = 300;

	void add() {
		System.out.println("더하기 : " + (a + b));
	}

	void subtract() {
		System.out.println("빼기 : " + (a - b));
	}

	void multi() {
		System.out.println("곱하기 : " + (a * b));
	}

	void divResult() {
		System.out.println("몫 : " + ((double) a / (double) b));
	}

	void divRemainder() {

		System.out.println("나머지 : " + (a % b));
	}

	
	
	
	
	int Programming = 100;
	int management = 90;
	int math = 90;
	int algorythm = 95;

	void total() {System.out.println("총점 : "+(Programming+management+math+algorythm));System.out.println("평균 : "+(((double)Programming+(double)management+(double)math+(double)algorythm)/4));
	}
	
	int usd = 3000;
	int exchangeRate = 1200;

	void exhange() {System.out.println("한화 : "+(usd*exchangeRate));
	}
	int ipadPro = 999000;
	int discountRate = 15;

	void discount() {System.out.println("할인가 : "+(double)ipadPro*(((double)100-(double)discountRate)/(double)100));
	}

}
