// Do while 
// do {
//    ����� 
// } while(���ǽ�);
// ���ǽ��� �ؿ� �ֱ⶧����,
// do { } �� ����δ� �ּ� �ѹ��� ����ȴ�. 

public class DoWhileClass {

	public static void main
	(String[] args) {
		
		// 1 - 10���� ����ϴ³��� ������ 
		int i = 1; 
		
		do {
			System.out.println(i++);
		} while(i < 1); 
	
		
		//-- break, continue
		//-- ���� z�� 5�϶������� ����ϰ� �ʹ�. 
		int z=0;
		for(;z<=10;z++) {	
//			if(z<=5) { �� 11�� ���� 
//				System.out.println(z);
//			}
			if(z>5) break; 
			System.out.println(z);
		}
		
		
		// 1-100 ������ ���� 2�� �����?
		int z1 = 1;
		for(;z1<=10;z1++) {
			if(z1 % 2 == 0) {
				System.out.println(z1); 
				break;
			}
			// ... 
		}
		System.out.println("�����:" + z1);
		
	}
	
	
	
	
}
