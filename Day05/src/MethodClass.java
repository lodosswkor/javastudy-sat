
//-- 메서드 (함수) 
//-- 클래스/객체에서 행동을 담당 
//-- 메소드명() 
//-- int age; -> A a = new A(); a.age = 10;
//-- 이름() <-- 행위 (메소드/함수) 
//-- 문법은 
//-- 리턴타입 메소드(인자) {
//     행위..... 
//   }

//-- 자바는 모두 클래스로 정의됩니다. 
//-- 기본데이터타입을 제외한 모든것 (int,boolean,..... double)
//-- 클래스의 구성요소는?
//-- 속성, 메서드(행위), 생성자(행위)
//-- 속성 / 메서드를 구분하는 방법은? () 있냐 없냐

public class MethodClass {
	
	
	//-- 리턴값이 있는 메소드 
	static int plusMethod(int a, int b) {
		return a + b; 
	}
	
	//-- 리턴값이 없는 메소드 
	static void plusMethodA(int a, int b) {
		
		if( a > b ) {
			return; 
		}
		
		System.out.println(a + b);
	}
	
	
	public static void main(String args[]) {
		
		int a = 10; 
		int b = 20; 
		int c = plusMethod(a,b);
		
		System.out.println(c); 
		System.out.println(plusMethod(10,100));
	}

}
