
import math.MathUtilClass;
//import math.*;


//-- ���������ڸ� ����Ҽ� �ִ� �� 
//   Class, Ŭ���� �ɹ�����(�Ӽ�), Ŭ���� �޼��� 


class PublicClassA {
	
	public int pA = 10;    // �����
	protected int pB = 10; // ���� ���� �ִ� ��� 
	// (��������� ���������� �����Ѵ�.)  
	int pC = 10; // ���� �濡 �ִ� ��� 
	private int pD = 10; // ���� 
}

public class AccessClass {
	
	public static void main(String args[]) {
		PublicClassA pca = new PublicClassA(); 
		pca.pA = 10; 
		pca.pB = 10; 
		pca.pC = 10; 
		//pca.pD = 10; // ���� private

//		public int x1; //-- ��ü����  
//		private int x2; //-- �ڱ⸸(MathUtilClass) ��� 
//		protected int x3; //-- ���� ���� �ִ� ����� ��� 
//		int x4; //-- ���� �濡 �ִ� ����� ���
		MathUtilClass cls = new MathUtilClass();
	    cls.x1 = 10; 
//		cls.x3 = 10; // AccessClass �� math ����(������) 
//					 // �ȿ� ���� ������ ���Ұ� 
//		cls.x4 = 10; 
//		cls.x2 = 10;
		
		// public > protected > default > private 
		
	}

}
