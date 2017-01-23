import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {

		
		final int READY = 1;
		final int WATER = 2;
		final int FIRE = 3;
		final int BOIL = 4;
		final int INJECT = 5;
		final int OFF = 6;
		final int EAT = 7;

		int nowState = BOIL;

		switch (nowState) {

		case READY:
			System.out.println("냄비준비");
		case WATER:
			System.out.println("물");
		case FIRE:
			System.out.println("불");
		case BOIL:
			System.out.println("끓인다.");
		case INJECT:
			System.out.println("소스");
		case OFF:
			System.out.println("불끈다.");
		case EAT:
			System.out.println("먹는다.");
		default:
			System.out.println("설거지");
		}

	}
}
