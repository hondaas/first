
public class WhileM {

	void gugu(int number) {

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

	void guif(int number) {
		int i = 0;
		while (i < 90) {

			i++;

			System.out.println(number + "x" + i + "=" + (number * i));

		}
	}

	void array() {

		int i = 0;

		int[] scores = { 100, 40, 50, 23, 43, 20, 100, 43, 46, 26, 27, 52, 71 };

		int scoresCount = scores.length;
		int sum = 0;
		while (i < scoresCount) {

			sum += scores[i];

			i++;

			System.out.println(sum);

		}

	}

}
