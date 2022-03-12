import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		//- score 90 점 이상 A
		//- score 80 점 이상 B 
		//- score 70 점 이상 C 
		//- 그 외에는 F 
		
		//-- ! score 0 ~ 100
		//-- 사이의 값이어야 한다. 
		//-- 그 외의 값을 실행되면 안됨 
		
		if(score >= 0 && score <= 100) 
		{	
			String grade = ""; 
			switch(score / 10) {
				case 10 :
					grade = "A+";
					break;
				case 9 :
					grade = "A"; 
					break; 
				case 8 :
					grade = "B";
					break;
				case 7 :
					grade = "C";
					break;
				default:
					grade = "F"; 
					break; 
			}
			
			System.out.println("학점 : " + grade);
		
		} else {
			System.out.println
			("점수는 0~100점 까지 입니다.");
		}
		
	}

}
