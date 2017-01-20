
public class Arrays {

	public static void main(String[] args) {

		String[] names = { "메탈리카", "넬", "도트리" };

		for (int i = 0; i < names.length; i++) {

			System.out.println(i);
			System.out.println(names[i]);
		}

		int[] scores = { 100, 40, 50, 23, 43, 20, 100, 43, 46, 26, 27, 52, 71 };
		int sum = 0;

	
			// foreach
			// for을 간편하게 사용하기 위한 방법
			// 배열 요소를 순차로 꺼내어 준다.
			// 매우매우 빠르다.
			// for 보다 빠르다.
			
			
			for (int score : scores){
				
				System.out.println(score);
				
				
			

		}

	}
}
