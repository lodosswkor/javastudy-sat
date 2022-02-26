// ------- 
// 변수


public class Variable01 {

	public static void main(String[] args) {
		
		//-- 변수가 없는 세상 
		//-- 1+2
		System.out.println(1+2); 
		//-- 위의 값의 결과값에 * 20
		System.out.println((1+2)*20);
		
		//-- 변수 문법 
		// 데이터타입 변수이름; "선언"  
		int a = 1; 
		int b = 2;
		int c; 
		
		//-- int 0name 숫자로 이름을 시작할 수 없다. 
		int name0; 
		
		//-- 변수명으로 _는 포함될수 있으나
		//-- - 포함할 수 없다. 
		int i_am_a_boy;
		int _age; 
		int $name; 
		
		// 변수명은 숫자로 시작할 수 없고, _ 와 $를 제외한 
		// 모든 특수문자는 사용할 수 없다. 
		// int u-are-a-girl; error 
		
		
		c = a + b; //( 1 + 2 )
		System.out.println(c);
		
		//-- 결과값에 * 20 
		System.out.println(c * 20);
		
		
		
	}
}
