import java.util.Scanner;

public class KeyboardInput extends Thread {
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		while (true) {
			sc.hasNext();
		}

	}

}