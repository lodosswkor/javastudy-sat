// 비트연산 

public class bitClass {
	
	public static void main(String[] args) {
		
		// 논리연산하고 똑같다. 
		// 0 은 거짓 
		// 1 은 참 
		byte a = 10; //  
		System.out.println(
				Integer.toBinaryString(a)
		);
		
		//-- bit연산에 And 
		byte b = 1;
		byte c = (byte)(a & b); 
		System.out.println(c);
		System.out.println(
				 Integer.toBinaryString(c)
		);
		
		//-- bit 연산에 Or 
		System.out.println(10 | 1); // 11
		System.out.println(
			 Integer.toBinaryString(10 | 1)
		); // 1011 
		
		//-- Not 
		byte z = 0; 
		System.out.println(~z);
		
		
		//-- 음수표현
		System.out.println(
				Integer.toBinaryString(-1)
		);
		System.out.println(
				Integer.toBinaryString(-2)
		);
		
		
		//-- 1. 양수를 2진수로 변환
		//-- 2. 2진수를 반전(보수) ~ 
		//-- 3. 2의 결과에 +1 을 한다 (2의 보수) 
		
		// 쉬프트 연산 
		// <<,>>,>>>
		byte aaa = 10; 
		System.out.println(aaa << 2);
		System.out.println(
			Integer.toBinaryString(aaa) 
		);
		System.out.println(
			Integer.toBinaryString(aaa<<2) 
		);
		System.out.println(
			Integer.toBinaryString(aaa>>2) 
		);
		
		//-- 음수 우측 쉬프트 
		System.out.println(
			Integer.toBinaryString(-10)
		);
		
		System.out.println(
			Integer.toBinaryString(-10 >> 2)
		);

		System.out.println(
			-10 >> 2
		);
		
		
		//-- 3항 연산자
		//-- 조건식(비교/논리) ? 값1 : 값2; 
		int point = 60; 
		String con 
		  = point > 70 ? "합격" : "불합격";  
		
		 System.out.println(con);
		
	}
	
}
