
// ����ȯ ((Data)Type Casting)
public class CastingClass {
	
	public static void main(String[] args) 
	{
		long age = 100; 
		int age2 = (int)age; // ����ȯ
		
	    // �ڵ� ����ȯ 
		char name = 100; 
		int name2 = name; 
		//-- ���� �����͸� ū ������Ÿ�Կ�
		//-- �������� ����ȯ�� �ڵ����� �ȴ�. 
		
		// ���� ����ȯ 
		long a = 1000; 
		int b = (int)a;
        //-- ū �����͸� ���� ������Ÿ�Կ� 
		//-- ����� �Ҷ� 
		// (������Ÿ��)������; 
		
		//!)
		//short aaa = 32767;
		//���� ����ȯ�Ҷ� ������ 
		short aaa = 129; 
		// byte�� �ִ������ �Ѿ 
		byte bbb = (byte)aaa;
		System.out.println(bbb);
		
		int abc = (int)3.14;
		float c = (float)3d;

		int abc2 = (int)3f;
		double abc3 = 30L;
		// ������ ���������� �Ǽ��� ����� �ϸ�
		// ���������� ���� ����ȯ�� �ʿ�
		// �� �ݴ��� ���� �ڵ� ����ȯ 
		
		
	}
}
