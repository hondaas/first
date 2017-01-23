import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int input2 = scanner.nextInt();
		int input3 = scanner.nextInt();

		if (input > input2) {

			if (input > input3) {

				System.out.println(input);
			} else {
				System.out.println(input3);
			}

		} else {
			if (input2 > input3) {
				System.out.println(input2);

			} else {
				System.out.println(input3);
			}

		}
	}
}
