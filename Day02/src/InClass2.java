
// 증감연산 
public class InClass2 {

  public static void main(String[] args) {
	  
	  int a = 10; 
	  // 1. a = a + 1; 
	  // 2. a += 1;
	  // 3. ++a; --a;  
	  // 연산자가 앞에 있는경우 전위연산
	  // a++; a--;
	  // 후위연산 
	  // a = 10; 
	  System.out.println(++a); // 11
	  //System.out.println(--a); // 10
	  System.out.println(a--); // 11
	  System.out.println(a); // 10
	  
	  
	  //== 예제 쳐보기 
	  
	  int x = 10;
	  int y = x++; 
	  System.out.println("x:" + x);
	  System.out.println("y:" + y);
	  
	  // 비교연산 
	  // >,<,>=,<=,==,!=
	  // 결과값은 논리(참 혹은 거짓) 
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
	  
	  // 논리연산 
	  // 결과값 참 거짓
	  // a) AND 연산 A && B ( A & B )
	  //    A와 B 모두 참일때 참
	  //    true & true => true
	  //    true & false => false 
	  //    false & true => false 
	  //    false & false => false 
	  // b) OR 연산 A || B ( A | B ) 
	  //    A와 B중 하나라도 true면 true 
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
	  
	  System.out.println("논리연산");
	  System.out.println(b_1);
	  
	  System.out.println(
		  (b_1 > b_2) | (b_1++ > b_2)
		  //(b_1 > b_2) || (b_1++ > b_2) 
		  // b_1 -> 10
	  );

	  System.out.println("논리연산2");
	  System.out.println(b_1);
	  
	  
	  //-- XOR 
	  // 두항중 하나의 값만 true 경우 true다 
	  // A ^ B 
	  
	  System.out.println("XOR TEST");
	  System.out.println(true ^ true);
	  System.out.println(true ^ false);
	  System.out.println(false ^ true);
	  System.out.println(false ^ false);
	 
	  
	  //-- NOT ! ex) A != B
	  //-- !(논리값) !true !false
	  int c_1 = 100;
	  System.out.println("Not 연산");
	  System.out.println(!(10 > 5));
	  System.out.println(
			  !(10 > 5) 
			  && 
			  (c_1++ > 100) 
	  );
	  System.out.println(c_1);
	  
	  
	  
	  
	  
	  
	 
  }

}

