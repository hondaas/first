
class MultiThread2 {

	public static void main(String[] args) {

		CalThread thread1 = new CalThread();

		PrintThread thread2 = new PrintThread();

		SharedArea sa = new SharedArea();

		/*
		 * 
		 * 
		 * 07.
		 * 
		 * 
		 * 공유영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장
		 * 
		 * 
		 * 08.
		 * 
		 * 
		 */

		thread1.sa_save = sa;

		thread2.sa_read = sa;

		// 스레드 실행

		thread1.start();

		thread2.start();

	}

}