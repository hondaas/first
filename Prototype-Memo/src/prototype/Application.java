package prototype;

public class Application {

	public static void main(String[] args) {
		
		Memo memo = new Memo();
		memo.writeMemo("�ȳ��ϼ���");
		
		try {
			Memo cloneMemo = (Memo) memo.clone();
			cloneMemo.writeMemo("�ݰ����ϴ�.");
			
			memo.printMemo();
			cloneMemo.printMemo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
