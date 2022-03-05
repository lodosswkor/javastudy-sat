
public class InClass {

	
	public static void main(String[] args)
	{
		// 대입연산 (기본)
		int a = 10; 
		
		// 대입연산과 산술연산 
		a += 10; // a = a + 10; 
		System.out.println(a); // 20
		a -= 10; // a = a - 10; 
		System.out.println(a); // 10
		a /= 10; // a = a / 10; 
		System.out.println(a); // 1
		a *= 10; // a = a * 10; 
		System.out.println(a); // 10
		
		// 산술연산 
		// +,-,/,*,%
		// %는 나머지값 
		
		int a_1 = 1; 
		int a_2 = 0; 
		//-- 덧셈연산 
		System.out.println(a_1 + 100);
		// a_1 = a_1 + 100;
		System.out.println(a_1); // 1 
		a_2 = a_1 + a_2; 
		//-- 곱셉
		a_2 = a_1 * a_2; 
		//-- 뺄샘 
		a_1 = a_2 - 1000; // -999
		a_1 = a_1 * -1; // a_1 *= -1;
		
		// 나눗셈 
		a_1 = a_1 / 10; // 99.9 
		System.out.println(a_1); 
		// 뒤에 소숫점 버림
		
		// 나머지 값 
		a_1 = a_1 % 2; // 
		System.out.println(a_1); 
		
		
		
		
		
		
	}
	
}
