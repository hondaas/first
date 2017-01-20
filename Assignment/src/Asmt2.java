import java.util.Scanner;

public class Asmt2 {

	public static void main(String[] args) {
		while (true) {

			System.out.println("실행 할 프로그램을 선택하셈");
			System.out.println("1 : 총점과 평균");
			System.out.println("2 : 섭씨와 화씨");
			System.out.println("3 : BMI 계산");
			System.out.println("4 : 종료");

			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();

			if (input == 1) {
				System.out.println("[총점과 평균]");
				System.out.println("점수를 5개 입력하세요");
				System.out.println("점수1");
				int score1 = scanner.nextInt();
				System.out.println("점수2");
				int score2 = scanner.nextInt();
				System.out.println("점수3");
				int score3 = scanner.nextInt();
				System.out.println("점수4");
				int score4 = scanner.nextInt();
				System.out.println("점수5");
				int score5 = scanner.nextInt();

				int sum = score1 + score2 + score3 + score4 + score5;
				double ave = sum / 5.0;

				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + ave);
				System.out.println(" ");
				System.out.println("1: 처음으로 ");
				System.out.println("2: 종료 ");
				int input1 = scanner.nextInt();

				if (input1 == 1) {
				} else if (input1 == 2) {
					break;
				}

			}

			if (input == 2) {
				System.out.println("[섭씨와 화씨]");
				System.out.println("입력할 값이 섭씨냐 화씨냐?");
				System.out.println("1:섭씨  2:화씨");

				int inputCorF = scanner.nextInt();

				if (inputCorF == 1) {

					System.out.println("섭씨 값 입력하셈");
					double inputC = scanner.nextInt();

					double result = (inputC * 1.8) + 32;

					System.out.println(inputC + "℃" + " = " + result + "Ｆ");
					System.out.println(" ");
					System.out.println("1: 처음으로 ");
					System.out.println("2: 종료 ");
					int input1 = scanner.nextInt();

					if (input1 == 1) {
					} else if (input1 == 2) {
						break;
					}

				} else if (inputCorF == 2) {

					System.out.println("화씨 값 입력하셈");
					double inputF = scanner.nextInt();

					double result = (inputF - 32) / 1.8;

					System.out.println(inputF + "Ｆ" + " = " + result + "℃");
					System.out.println(" ");
					System.out.println("1: 처음으로 ");
					System.out.println("2: 종료 ");
					int input1 = scanner.nextInt();

					if (input1 == 1) {
					} else if (input1 == 2) {
						break;
					}
				}

			}
			if (input == 3) {
				System.out.println("[BMI 계산]");
				System.out.println("당신의 몸 무게는? (kg");
				double inputW = scanner.nextInt();
				System.out.println("당신의 키는? (cm");
				double inputH = scanner.nextInt();

				double bmi = inputW / ((inputH/100.0) * (inputH/100.0));

				System.out.println("몸 무게 : " + inputW + "cm" + "   키 : " + inputH + "cm");
				System.out.println("BMI 지수 : " + bmi);
				System.out.println(" ");

				if (bmi < 18.5) {
					System.out.println("너는 '저체중' 입니다. ");
					System.out.println("많이 드세요.");
				} else if (bmi < 22.9) {
					System.out.println("너는 '정상' 입니다. ");
					System.out.println("잘 유지하세요.");
				} else if (bmi < 24.9) {
					System.out.println("너는 '경도 비만' 입니다. ");
					System.out.println("꾸준히 운동하세요.");
				} else if (bmi < 29.9) {
					System.out.println("너는 '고도 비만' 입니다. ");
					System.out.println("작작먹고 운동 많이 하세요");
				} else {
					System.out.println("너는 '초고도 비만' 입니다. ");
					System.out.println("노답");
				}
				System.out.println(" ");
				System.out.println("1: 처음으로 ");
				System.out.println("2: 종료 ");
				int input1 = scanner.nextInt();

				if (input1 == 1) {
				} else if (input1 == 2) {
					break;
				}
			}

			if (input == 4) {break;
			}

		}
	}

}
