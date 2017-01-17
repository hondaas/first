package test1;

import java.util.Scanner;

public class Calculator4 {
	public static void main(String[]args) {

	//사용자에게 입력 받을 수 있는 객체를 만든다.
	// (Scanner input = new Scanner(); 에서 에러가 나오면 import한다. 그리고 System.in을 괄호안에 작성)
	
	Scanner input = new Scanner( System.in );
	
	
	
	System.out.println("숫자를 입력 하세요");
	int number = input.nextInt();  
    
     int a = 0;
     
     a++;

	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	System.out.println(number + "*" + a + "= " + (number*a)); 	 a++;
	
	
	
	
	
	
	
	
	}
}
