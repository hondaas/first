import java.util.Scanner;

public class WhileP {

	public static void main(String[] args) {

		WhileM a = new WhileM();

		int number = 1;
		int j = 0;

		while (j < 9) {

			++j;
			++number;
			int i = 0;

			while (i < 9) {

				i++;

				System.out.println(number + "x" + i + "=" + (number * i));
			}
		}

	}

}
