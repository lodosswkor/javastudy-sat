
// ���ǹ�(���Ǻб⹮) - 
// if 
// if ~ else 
// if ~ else if 
// if ~ else if ~ else

public class IfClass {
	
	public static void 
	main(String[] args) {
		
		//-- ��� ������ 70�� �̻��϶�
		//-- �հ��� ����ϰ� �ʹ�. 
		
		int point = 65; // 70�� ȹ�� 
		
		if(point >= 70) { // ���϶� 
			System.out.println("�հ�");
		} else {// �����϶� 
			System.out.println("���հ�");
		}
		
		//-- A������ 90 �̻� 
		//-- B������ 80 �̻� 
		//-- C������ 70 �̻� 
		//-- D������ 60 �̻� 
		//-- �� �ܴ� F 
		
		if(point >= 90) { // A���� 
			System.out.println("A����");
		} 
		
		if(point >= 80) { // B���� 
			System.out.println("B����");
		} 
		
		if(point >= 70) { // C����
			System.out.println("C����"); 
			
		}
		
		if(point >= 60) { // D����
			System.out.println("D����"); 
			
		}
		
		if(point < 60) { // F���� 
			System.out.println("F����");
		}
		
		
		// if - else if - else 
		if(point >= 90) {
			System.out.println("A����");
		} else if(point >= 80) {
			System.out.println("B����");
		} else if(point >= 70) {
			System.out.println("C����");
		} else if(point >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
		
		
		/*
		 *  ���� �б⹮ ( if else ) 
		 
		 if(���ǽ�a) {
		 	���ǽ�a�� ���϶� ���� 
		 	...
		 } else if(���ǽ�b) {
		 	���ǽ�b�� ���϶� ���� 
		 } else {
		 	���ǽ�a,b�� ��ΰ����϶� 
		 } 
  
		 * */
		
		point = 80; 
		if(point >= 90) {
			System.out.println("A����");
		} else if(point >= 60) {
			// 80���ε��� �ұ��ϰ�,
			// �ι�° else if �� ���̱� 
			// ������ D������ ��� (����) 
			System.out.println("D����");
		} else if(point >= 80) {
			System.out.println("B����");
		} else if(point >= 70) {
			System.out.println("C����");
		} else {
			System.out.println("F����");
		}	 
		
		//-- ���� ������ �ɾ 
		//-- �������� 1000�� �̸��̸� '��������'
		//-- �������� 2000�� �̸��̸� '����ö'   
		//-- �������� 1500�� �̸��̸� '����'
		//-- �������� 5000�� �̻��̸� '�ý�' 
		
		int money = 1200;
		
		if(money >= 5000) {
			
		} else if(money < 1000) {
			
		} else if(money < 1500) {
			
		} else if(money < 2000) {
			
		} else {
			
		}
		
		//if else �� �����غ����� 
		
		
		
		

		
		
	}
	
}
