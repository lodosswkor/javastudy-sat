
public class VarDataType {
	
	public static void main(String[] args) {
		
		// 변수 선언은 [데이터타입] 변수명; 
		// 변수 선언과 동시에 초기화 [데이터타입] 변수명 = 1; 
		// 자바의 기본 데이터 타입 
		// -1.정수형
		// char, byte, short, int, long 
		
		int age = 10; 
		
		System.out.println(20); // int 정수형 기본타입 
		
		// -2.실수형 
		// - float, double (기본데이터 타입) 
		float f1 = 2.01f;
		
		System.out.println(f1);
		
		// -3.논리형은 다음기회에...   
		
		char name = 'a';
		System.out.println(name);
		System.out.println(name + 1); // 98 
		System.out.println((int)name);
		
		System.out.println((char)(name - 5));
		
	}
}
