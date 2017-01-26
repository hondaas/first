
class PrintThread extends Thread {

	SharedArea sa_read;

	public void run() {

		while (sa_read.isReady != true)

			continue;

		System.out.println(sa_read.result);// 공유영역의 데이터 출력

	}

}