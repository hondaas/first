import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int input2 = scanner.nextInt();
		int input3 = scanner.nextInt();

		int one = (input < input2) ? input : input2;
		int two = (one < input3) ? one : input3;

		System.out.println(two);

	}
}
