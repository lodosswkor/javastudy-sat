
// �迭 �й� 
// char a
// 1. ������Ÿ��[] ������; (����) 
// 2. ������Ÿ�� ������[]; 
// ---- ������ �ʱ�ȭ ��� 
// 1. int[] age = {10,20,30,40}; // ����� ���ÿ� �ʱ�ȭ 
// 2. int[] age = new int[3]; // ����� �游 ����� ���� 
//    age[0] = 10;
//    age[1] = 20;
//    age[2] = 30; 

public class ArrayClass {

	public static void main(String[] arg) {
		
		// 1. ����� ���ÿ� �� �ʱ�ȭ 
		String week_1[] = {"��","ȭ","��","��","��","��","��"};
		
		for(int i=6;i>=0;i--) {
			System.out.println(week_1[i]);
			week_1[i] += "����"; // a += 1 -> a = a + 1;
			System.out.println(week_1[i]);
		}
		
		// 2. ����, �游���, �� �ʱ�ȭ(�Է�) 
		String[] week_2 = new String[7]; 
		week_2[0] = "��";
		week_2[1] = "ȭ";
		week_2[2] = "��";
		week_2[3] = "��";
		week_2[4] = "��";
		week_2[5] = "��";
		week_2[6] = "��";
		
		for(int i=0;i<7;i++) {
			System.out.println(week_2[i]);
			week_2[i] += "����"; 
			System.out.println(week_2[i]);
		}

		// 
		// !) �迭���̸� ���ϴ� ���(�Լ�) 
		System.out.println
		("�迭���� week_1�� ���� : " + week_1.length);
		
		// a. �迭���� week_1�� ����Ǿ� �ִ� 
		// ��簪�� ����غ���(������) 
	    for(int i=0; i<week_1.length; i++) {
			System.out.println(week_1[i]);
	    }
	    
	    // ������ 
	    for(int i=week_1.length-1; i>=0; i++) {
			System.out.println(week_1[i]);
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
