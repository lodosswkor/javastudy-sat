
public class LottoClass {
	
	public static void main(String[] args) {
		
		int[] lotNums = new int[45];
		
		//-- �ζ� ��ȣ 1 ~ 45���� �迭�� �Է� 
		for(int i=0;i<lotNums.length;i++) {
			lotNums[i] = i + 1;
		}
		
		//-- �ζ� ��ȣ �Է°� Ȯ�� 
		
		int random_num = 0; // ���� 
		int num_of_printed = 0; // ��µ� �ζǹ�ȣ ��
		System.out.println("#### �̹��� �ζ� ��ȣ!! ####");
		System.out.print("�ζǹ�ȣ�� : ");
		
		//-- ����1 for ������ ��� 
		/*
		for(int i=0;
			i<lotNums.length && num_of_printed < 6;
			i++) {
			
			random_num = (int)(Math.random()*100) + 1;
			if(random_num % 9 == 0) { 
				System.out.print(lotNums[i] + " ");
				num_of_printed ++;
			}
			
			//if(num_of_printed == 6) break; 
		}
		*/
		
		//-- ��ǥ : �ζǹ�ȣ ������ 
		//-- ���� : 1-45 ������ ���ڸ� ����Ѵ�
		//       : 6���� ���ڸ� �̴´�. 
		
		//--     : �Ʒ��ڵ��� ������ 
		//       : 1. ���������, ������ ������ ������ 
		//            6�� �̻��� ���ڸ� ����Ѵ�. 
		//         2. ������ ������ �ʹ� �о, �ζ� ��ȣ��
		//            �ʹ� �����ϰ� �������� ( random % 2 = �� 50% ) 
		//            -> �� 10% ( random % 9 = �� 10%) 
		//         3. 2��ó�� Ȯ�����ߴϱ�, ��¼��� �پ�� 
		//            �迭�� �ε���(0-44����)�� �Ѿ�� i���� ���Ǵ�
		//            ��쵵 �ִ��� ( 44���� i�� ���Ǹ� �ٽ� ó������ �̵� )
		//         4. Ȯ���� �ߺ��� ��ȣ�� ���ü��� �ִ���. 
		int i = 0; 
		num_of_printed = 0; 
		
		while(true) {

			if(i > lotNums.length - 1) {  // 3�� �ذ� 
				i = 0;
				continue;
			}
				
			random_num = (int)(Math.random()*100) + 1;
			if(lotNums[i] > 0 && random_num % 9 == 0) { // 2,4�� �ذ� 
				System.out.print(lotNums[i] + " ");
				lotNums[i] = -1; // 4�� �ذ� 
				num_of_printed ++;
			}
			
			i++; 
			if(num_of_printed == 6) break; // 1�� ���� �ذ� 
		}
		
		
	}
	
}
