//-- throws 예외 떠넘기기 
import java.util.*; 

public class ThrowsClass {
	
	public static void main(String[] args) {
	
		while(true) { 
			try {
				readUserInput();
				break; 
			} catch(Exception e) {
				System.out.println("숫자 입력해 인마."); 
			}
		}
	}
	
	static void readUserInput() throws Exception {
		
		System.out.print("숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in); 
		int val = sc.nextInt();
		System.out.println("입력된 숫자 : " + val);
		
	}
	
}
