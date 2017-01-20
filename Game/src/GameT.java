class GameTm extends Thread {

	private PipedInputStream fromHeatingLine;
	private PipedOutputStream toPackingLine;

	GameTm(PipedInputStream fromHeatingLine, 
                    PipedOutputStream toPackingLine) {
          this.fromHeatingLine = fromHeatingLine;
          this.toPackingLine = toPackingLine;
      }

	public void run() {
		try {
			int dataFromHeating;
			int producingData;

			while (true) {
				// 가열 라인에서 데이터 받음
				dataFromHeating = fromHeatingLine.read();

				// 가열 라인에서 받은 데이터 가공처리
				producingData = dataFromHeating * 2;

				// 가공처리된 데이터 포장 라인에 전송
				toPackingLine.write(producingData);

				if (dataFromHeating == 0x00) {
					break;
				}
			}
		} catch (IOException ex) {
			System.out.println("제조 라인에서 이상 발생:" + ex.getMessage());
		}
	}
}