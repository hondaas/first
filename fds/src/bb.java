// 멀티스레드를 지원하는 클래스를 만들려면 java.lang.Thread 클래스의 상속받아야 함
class bb extends Thread {

 bb(String name) { // 생성자에 스레드 이름이 전달인자로 넘어 옴
  // ThreadExam의 상위 클래스인 Thread의 생성자(super)를 호출
  super(name);  // 전달인자로 준 값이 스레드의 이름이 됨
 }

 // 스레드 객체가 수행해야 하는 작업을 run() 메서드를 오버라이딩하여 이 내부에 기술
 public void run() {
  while(true) {
	  
	  System.out.println("김도준");
	  System.out.println("인병주");
	  System.out.println("이지수");
	  
	  
  }
   
  }
 }

