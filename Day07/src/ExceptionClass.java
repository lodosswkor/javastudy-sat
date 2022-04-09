
import java.util.*;
// ����ó�� ��� 1: try {} catch{} finally {}
// ����ó�� ��� 2: throws ���� 
public class ExceptionClass {

	public static void main(String[] args) {
		
		boolean loop = true; 
		
		while(loop) {
			System.out.print("���ڸ� �Է��� �ּ���");
			Scanner sc = new Scanner(System.in);
			int val = 0; 
			
			try {
				val = sc.nextInt(); //-- �����ͺ��̽� Ŀ�ؼ�
				// �����ͺ��̽� Ŭ���� 
				//-- �̺κ��� ���ܸ� �߻���Ű�� ����
				loop = false; 
			} catch(InputMismatchException e) {
				System.out.println("ill error");
				loop = true; 
				continue; 
			} catch(Exception e) {
				System.out.println
				("���α׷��� ���ڸ� �Է� ���� �� �־��!!\n");
				loop = true; 
				continue;
			} finally {
				// �����ͺ��̽� Ŭ���� 
			}
			
			System.out.println("���� ���� : " + val); 
				
		}
		
	}
}
