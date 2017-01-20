import java.util.Scanner;

public class GameMain2 {
	
	 public static void main(String[] args) {
		    System.out.println(" 파이즈라이닝 실습");

		    GameTm t1 = new GameTm("Thread 1 : "); // 하나의 클래스에 t1, t2 의 2개의 생성자를 만듭니다.
		    GameTm2 t2 = new GameTm2("Thread 2 : ");

			
		    t1.start(); // 위에서 생성한 생성자를 각각의 쓰레드로 실행시킵니다.
		    t2.start();
		    System.out.println("---------------------------");
		  
	
		    
	 }
		
		
}


