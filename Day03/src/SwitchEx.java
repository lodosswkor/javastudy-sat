import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		do {

			System.out.print("������ �Է��ϼ���: ");
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();
			
			//--- ���߿� 
			if(score < 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			if(score > 100) {
				System.out.println
				("������ 0������ 100�� �����Դϴ�.\n");
				continue;
			}
			//---------------------------
			
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
			
			System.out.println("���� : " + grade);
			System.out.println("");
			
		} while(true); 
		
	}

}
