
//-- �޼��� (�Լ�) 
//-- Ŭ����/��ü���� �ൿ�� ��� 
//-- �޼ҵ��() 
//-- int age; -> A a = new A(); a.age = 10;
//-- �̸�() <-- ���� (�޼ҵ�/�Լ�) 
//-- ������ 
//-- ����Ÿ�� �޼ҵ�(����) {
//     ����..... 
//   }

//-- �ڹٴ� ��� Ŭ������ ���ǵ˴ϴ�. 
//-- �⺻������Ÿ���� ������ ���� (int,boolean,..... double)
//-- Ŭ������ ������Ҵ�?
//-- �Ӽ�, �޼���(����), ������(����)
//-- �Ӽ� / �޼��带 �����ϴ� �����? () �ֳ� ����

public class MethodClass {
	
	
	//-- ���ϰ��� �ִ� �޼ҵ� 
	static int plusMethod(int a, int b) {
		return a + b; 
	}
	
	//-- ���ϰ��� ���� �޼ҵ� 
	static void plusMethodA(int a, int b) {
		
		if( a > b ) {
			return; 
		}
		
		System.out.println(a + b);
	}
	
	
	public static void main(String args[]) {
		
		int a = 10; 
		int b = 20; 
		int c = plusMethod(a,b);
		
		System.out.println(c); 
		System.out.println(plusMethod(10,100));
	}

}
