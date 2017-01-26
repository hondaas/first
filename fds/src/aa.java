import java.util.Scanner;

// 멀티스레드를 지원하는 클래스를 만들려면 java.lang.Thread 클래스의 상속받아야 함
class aa extends Thread {

 aa(String name) { // 생성자에 스레드 이름이 전달인자로 넘어 옴
  // ThreadExam의 상위 클래스인 Thread의 생성자(super)를 호출
  super(name);  // 전달인자로 준 값이 스레드의 이름이 됨
 }

 // 스레드 객체가 수행해야 하는 작업을 run() 메서드를 오버라이딩하여 이 내부에 기술
 public void run() {

	 Scanner input = new Scanner (System.in);
	 String type = input.next();
	 
  }
 }

