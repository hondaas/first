package subsystem;

class PrintHelper {

	private final String PRINT_FORMAT = "�Է��Ͻ� ���ڴ� %s �Դϴ�.";
	
	public void printText(String message) {
		
		String formatString = String.format(PRINT_FORMAT, message);
		System.out.println(formatString);
		
	}
	
}
