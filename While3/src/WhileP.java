import java.util.Scanner;

public class WhileP {

	public static void main(String[] args) {

		
		
		
		
		int[][] numbers = {

				{ 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 
				{ 3, 6, 9, 12, 15, 18, 21, 24 },
				{ 4, 8, 12, 16, 20, 24, 28, 32, 36 }

		};

		// 가장 크게 도는 반복을 생각할 필요가 있다.


		int i = 0;
		int j = 0;

		int rowCount = numbers.length;

		while (i < rowCount) {
			int colCount = numbers[i].length;
			while (j < colCount) {
				System.out.println(numbers[i][j]);
				j++;
			}
			j = 0;
			i++;
		}
	}
}
