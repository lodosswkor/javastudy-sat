
public class ConstantClass {

	public static void main(String[] args) 
	{
		int age = 45; 
		System.out.println(age); 
		age = age + 1; 
		System.out.println(age);
		
		//-- 변수로 pi 를 선언하면 변경도 가능
		//-- 오류발생 빈도가 높아진다. 
		float pi = 3.14f; 
		System.out.println(pi);
		pi = pi + 1.00f;
		System.out.println(pi);
		
		//-- 따라서 구조적으로 아에 변경을 
		//-- 금지시키는 방법은 "상수"로 선언
		//-- 하는것 
		
		final float PI = 3.14f; 
		//PI = PI + 1.00f; // 에러 발생 
		
		// 사용 예 
		final char KEY_UP = 72; 
		final char KEY_DOWN = 80; 
		final char KEY_LEFT = 75; 
		final char KEY_RIGHT = 77; 
		
		final char KEY = 88; 
			
		System.out.println(11);
		
	}
	
}
