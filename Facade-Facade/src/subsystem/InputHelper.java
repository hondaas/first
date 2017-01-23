package subsystem;

import java.util.Scanner;

class InputHelper {

	private Scanner scanner;
	
	public InputHelper() {
		scanner = new Scanner(System.in);
	}
	
	public String getString() {
		
		String text = "";
		
		while ( text == null || text.length() == 0 ) {
			System.out.println("�ؽ�Ʈ�� �Է��ϼ���.");
			text = scanner.nextLine();
		}
		
		return text;
		
	}
	
}
