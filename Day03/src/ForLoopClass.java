
// For �ݺ��� ( For loop )
/*
 *  for���� ���� 
 *  
	for(�ʱ�ȭ��; ���ǽ�; ������) {
		���๮ ....
	}
	
	���ǽ��� ��(true)�� ��쿡 ���� �Ǹ�,
	���ǽ��� ����(false)�϶� ���� �ݺ����� �ȴ�.
	
*/
//
public class ForLoopClass {
	
	public static void main(String[] args) {
			
		// 1���� 100���� ����غ���.
		// �ݺ����� ���°�� 
		// System.out.println(1);
		// System.out.println(2);
		// System.out.println(3);
		//.. 100 ���� �����Ѵ�. 
		//int num=1;
//		for(int num=1; num<=10;num++) {
//			System.out.println(num);
//		}
//		
//		//-- 10 ~ 1 ����ϰ�ʹ� 
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
//		
		//-- for���� if���� ����ؼ�
		//-- 1���� 100������ �����߿�
		//-- 2�� ����� ����ض�. 
//		for(int x=1;x<=100;x++) {
//			if(x%2 == 0) {
//				System.out.println(x);
//			}
//		}
//		
		//-- ��ø�� for������ �������� ����� ����
		//-- x * y = z 
		//-- x�� ����, y�� ���� 
		//-- �ܼ� 2 ~ 9
		for(int x=2; x<=9; x++) {
			for(int y=1; y<=9; y++) {
				System.out.println
				(x + "x" + y + "=" + (x * y));        
			}
		}
		
		//-- 
		//-- x x y = z 
		//-- y�� �������� x�� �������� 
//		
//		for(int y=1;y<=9;y++) {
//			for(int x=2; y<=9; x++) {
//				System.out.print
//				(x + "x" + y + "=" + (x * y) + "\t");
//			}
//			System.out.print("\n");
//		}
		
		
		int z = 10; 
		
		for(;z<=50;z+=10) {
			
		} 
		
		System.out.println(z); // ? 
		
		
	}

}
