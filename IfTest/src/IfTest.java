
public class IfTest {

	public static void main(String[] args)

	{
	int pro = 90;
	int math =98;
	int algo =96;
	
	
	int sum = pro + math + algo;
	double ave = sum/3;
		
		if (ave>90) {
			
		
			
			String message = String.format("총점은 %d, 평균은 %.2f점 입니다.",sum,ave);
			
			System.out.println(message);
		}
		
		
		
		
		
		
		
		
		

		int age = 30;
		
		
		boolean cash = false;
		boolean card = true;

		
		boolean a = (cash && card == false) && (card == true);


		
		
		
		
		
		
		if (age >= 30) {
			System.out.println("입장가능");

			if (a) {
				System.out.println("카드입니다.");
			} else {
				System.out.println("현금입니다.");
			}
		}

		else {
			System.out.println("입장불가");
		}

	}
}
