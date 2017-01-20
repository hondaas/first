
public class GameTm3 extends Thread{ // 쓰레드를 사용자가 만든 클래스에 포함시킵니다.

  String name;  // 밑에 생성한 생성자에 들어있던 문자열이 String 타입의 변수에 들어갑니다.
 
  public GameTm3(String name) {

    // 'this'는 this가 속해있는 클래스에서 name 이라는 변수를 찾아오라는 뜻입니다.
    this.name = name; 
    System.out.println(this.name); 
  }
 
  public void run() {



    for(;;) { // 각각의 쓰레드마다 0~3까지 4번씩 루프를 돌려줍니다.
    	
  
      System.out.println("까마귀");




      try { // 쓰레드를 쓰게되면 반드시 try ~ catch 문을 써줘야 합니다. 공식같은 거니 외우세요.
        System.out.println("sleep 되는 쓰레드 : " + name);




        // 쓰레드를 통해 딜레이를 줍니다.100 = 0.1초, 1000 = 1초 입니다. 

        // 구분하기 위해 1초(1000)를 줬습니다.
        sleep(1000); 
      } catch(InterruptedException e) {
        e.printStackTrace();
     }
    }
  }}
