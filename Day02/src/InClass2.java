
// �������� 
public class InClass2 {

  public static void main(String[] args) {
	  
	  int a = 10; 
	  // 1. a = a + 1; 
	  // 2. a += 1;
	  // 3. ++a; --a;  
	  // �����ڰ� �տ� �ִ°�� ��������
	  // a++; a--;
	  // �������� 
	  // a = 10; 
	  System.out.println(++a); // 11
	  //System.out.println(--a); // 10
	  System.out.println(a--); // 11
	  System.out.println(a); // 10
	  
	  
	  //== ���� �ĺ��� 
	  
	  int x = 10;
	  int y = x++; 
	  System.out.println("x:" + x);
	  System.out.println("y:" + y);
	  
	  // �񱳿��� 
	  // >,<,>=,<=,==,!=
	  // ������� ��(�� Ȥ�� ����) 
	  // boolean isTrue = true / false; 
	  
	  int xx = 100; 
	  int yy = 99; 
	  System.out.println(xx > yy); // true
	  System.out.println(xx < yy); // false
	  System.out.println(xx <= yy++); // false 
	  System.out.println(xx <= yy++); // true 
	  System.out.println(xx == yy); // false
	  System.out.println(xx != yy); // true
	  System.out.println(xx != --yy); // false
	  
	  // ������ 
	  // ����� �� ����
	  // a) AND ���� A && B ( A & B )
	  //    A�� B ��� ���϶� ��
	  //    true & true => true
	  //    true & false => false 
	  //    false & true => false 
	  //    false & false => false 
	  // b) OR ���� A || B ( A | B ) 
	  //    A�� B�� �ϳ��� true�� true 
	  //    true | true => true 
	  //    true | false => true
	  //    false | true => true 
	  //    false | false => false 
	  
	  int b_1 = 10;
	  int b_2 = 9;
	  
	  System.out.println(
		 (b_1 < b_2) & (b_1++ > b_2) 
	     //(b_1 < b_2) && (b_1++ > b_2) 
	     // b_1 -> 10
	  ); 
	  
	  System.out.println("������");
	  System.out.println(b_1);
	  
	  System.out.println(
		  (b_1 > b_2) | (b_1++ > b_2)
		  //(b_1 > b_2) || (b_1++ > b_2) 
		  // b_1 -> 10
	  );

	  System.out.println("������2");
	  System.out.println(b_1);
	  
	  
	  //-- XOR 
	  // ������ �ϳ��� ���� true ��� true�� 
	  // A ^ B 
	  
	  System.out.println("XOR TEST");
	  System.out.println(true ^ true);
	  System.out.println(true ^ false);
	  System.out.println(false ^ true);
	  System.out.println(false ^ false);
	 
	  
	  //-- NOT ! ex) A != B
	  //-- !(����) !true !false
	  int c_1 = 100;
	  System.out.println("Not ����");
	  System.out.println(!(10 > 5));
	  System.out.println(
			  !(10 > 5) 
			  && 
			  (c_1++ > 100) 
	  );
	  System.out.println(c_1);
	  
	  
	  
	  
	  
	  
	 
  }

}

