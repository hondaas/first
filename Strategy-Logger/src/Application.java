import client.SystemLogger;
import strategy.impl.ConsoleWithFileLogger;
import strategy.impl.FileLogger;

public class Application {

	public static void main(String[] args) {
		SystemLogger logger = new SystemLogger();
		logger.getLogger().write("�ܼ� �ΰ�");
		
		logger.setLogger(new FileLogger());
		logger.getLogger().write("���Ϸΰ�");
		
		logger.setLogger(new ConsoleWithFileLogger());
		logger.getLogger().write("���Ϸΰ�");
	}
	
}
