package subsystem;

public class SubSystemFacade {

	private InputHelper inputHelper;
	private PrintHelper printHelper;
	private FileHelper fileHelper;
	
	public SubSystemFacade() {
		inputHelper = new InputHelper();
		printHelper = new PrintHelper();
		fileHelper = new FileHelper();
	}
	
	public void inputAndPrintMessage() {
		// ������ ��û ������ ����..
		String message = inputHelper.getString();
		printHelper.printText(message);
	}
	
	public void inputAndWriteMessage() {
		// ������ ��û ������ ����..
		String message = inputHelper.getString();
		printHelper.printText(message);
		fileHelper.writeFile(message);
	}
	
}
