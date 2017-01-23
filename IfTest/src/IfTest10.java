import java.util.Scanner;

public class IfTest10 {

	public static void main(String[] args) {

		
		for (int i = 1 ; i<101 ; i++) {
		
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
			
		}
		for (int i = 1 ; i<101 ; i++) {
		
			if(i % 2 == 1) {
				
				//i 값이 홀수라면 반복을 건너뛴다.
				continue;//for와 while에만 사용할 수 있다.
				
				//continue를 만나는 순간 밑을 무시하고  for로 돌아간다.
			}
			System.out.println(i);
			
		}
		
		

	}
	}
