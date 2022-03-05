
//-- 변수의 범위(scope) 
//-- 범위는 {   } 사이로 한다. 
public class ScopeClass {

	static int age = 10;  //-- 클래스 범위에서
				          // 변수 선언 
	// (클래스)전역변수
	// 클래스 변수
	// 맴버 변수 
	 
	
	public static void main(String[] args) 
	{
		int age3 = 200; 
		// 지역변수 
		{
			int age2 = 100; 
			// 지역변수 
			System.out.println(age3);
		}
		
		System.out.println(age);
		//System.out.println(age2); //Error
		System.out.println(age3);
	}
	
}
