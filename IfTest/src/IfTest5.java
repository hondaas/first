import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {

		
		System.out.println("1:섭 2:화");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		
		
		

		if (input == 1) {
			
			System.out.println("수치?");
			int input2 = scanner.nextInt();
			
			double result = (input2 * 1.8) + 32;
			
			System.out.println(result);

		} else {
			
			System.out.println("수치?");
			int input2 = scanner.nextInt();
			
			double result = (input2 -32) / 1.8;
			
			System.out.println(result);
		}

		
		
		
		
	}
}
