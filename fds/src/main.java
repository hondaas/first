class ThreadTest01 {
 public static void main(String[] args) {
  // 스레드 클래스를 인스턴스화하여 독립된 스레드를 생성
  aa t1 = new aa("첫 번째 스레드");
  bb t2 = new bb("두 번째 스레드");
  // start() 메서드를 호출하면 스레드 객체의 run() 메서드가 돌면서 스레드가 실행
  t1.start();
  t2.start();
 }
}