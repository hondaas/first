import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("날씨?");
			System.out.println("1:비 2:맑");

			Scanner scanner = new Scanner(System.in);

			int input = scanner.nextInt();

			if (input == 1) {
				System.out.println("우산써");

			} else if (input == 2) {
				System.out.println("걍 가");
			}
			else {break;}

		}

	}
}
