//-- throws ���� ���ѱ�� 
import java.util.*; 

public class ThrowsClass {
	
	public static void main(String[] args) {
	
		while(true) { 
			try {
				readUserInput();
				break; 
			} catch(Exception e) {
				System.out.println("���� �Է��� �θ�."); 
			}
		}
	}
	
	static void readUserInput() throws Exception {
		
		System.out.print("���ڸ� �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in); 
		int val = sc.nextInt();
		System.out.println("�Էµ� ���� : " + val);
		
	}
	
}
