
public class InClass {

	
	public static void main(String[] args)
	{
		// ���Կ��� (�⺻)
		int a = 10; 
		
		// ���Կ���� ������� 
		a += 10; // a = a + 10; 
		System.out.println(a); // 20
		a -= 10; // a = a - 10; 
		System.out.println(a); // 10
		a /= 10; // a = a / 10; 
		System.out.println(a); // 1
		a *= 10; // a = a * 10; 
		System.out.println(a); // 10
		
		// ������� 
		// +,-,/,*,%
		// %�� �������� 
		
		int a_1 = 1; 
		int a_2 = 0; 
		//-- �������� 
		System.out.println(a_1 + 100);
		// a_1 = a_1 + 100;
		System.out.println(a_1); // 1 
		a_2 = a_1 + a_2; 
		//-- ����
		a_2 = a_1 * a_2; 
		//-- ���� 
		a_1 = a_2 - 1000; // -999
		a_1 = a_1 * -1; // a_1 *= -1;
		
		// ������ 
		a_1 = a_1 / 10; // 99.9 
		System.out.println(a_1); 
		// �ڿ� �Ҽ��� ����
		
		// ������ �� 
		a_1 = a_1 % 2; // 
		System.out.println(a_1); 
		
		
		
		
		
		
	}
	
}
