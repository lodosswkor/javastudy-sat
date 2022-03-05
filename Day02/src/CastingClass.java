
// 형변환 ((Data)Type Casting)
public class CastingClass {
	
	public static void main(String[] args) 
	{
		long age = 100; 
		int age2 = (int)age; // 형변환
		
	    // 자동 형변환 
		char name = 100; 
		int name2 = name; 
		//-- 작은 데이터를 큰 데이터타입에
		//-- 담을때는 형변환이 자동으로 된다. 
		
		// 강제 형변환 
		long a = 1000; 
		int b = (int)a;
        //-- 큰 데이터를 작은 데이터타입에 
		//-- 담고자 할때 
		// (데이터타입)변수명; 
		
		//!)
		//short aaa = 32767;
		//강제 형변환할때 주의점 
		short aaa = 129; 
		// byte의 최대범위를 넘어섬 
		byte bbb = (byte)aaa;
		System.out.println(bbb);
		
		int abc = (int)3.14;
		float c = (float)3d;

		int abc2 = (int)3f;
		double abc3 = 30L;
		// 실제로 정수변수에 실수를 담고자 하면
		// 정수형으로 강제 형변환이 필요
		// 그 반대의 경우는 자동 형변환 
		
		
	}
}
