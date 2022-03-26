
import math.MathUtilClass;
//import math.*;


//-- 접근제한자를 사용할수 있는 곳 
//   Class, 클래스 맴버변수(속성), 클래스 메서드 


class PublicClassA {
	
	public int pA = 10;    // 모든사람
	protected int pB = 10; // 같은 집에 있는 사람 
	// (폴더기반의 접근제한을 구현한다.)  
	int pC = 10; // 같은 방에 있는 사람 
	private int pD = 10; // 나만 
}

public class AccessClass {
	
	public static void main(String args[]) {
		PublicClassA pca = new PublicClassA(); 
		pca.pA = 10; 
		pca.pB = 10; 
		pca.pC = 10; 
		//pca.pD = 10; // 오류 private

//		public int x1; //-- 전체공유  
//		private int x2; //-- 자기만(MathUtilClass) 사용 
//		protected int x3; //-- 같은 집에 있는 사람만 사용 
//		int x4; //-- 같은 방에 있는 사람만 사용
		MathUtilClass cls = new MathUtilClass();
	    cls.x1 = 10; 
//		cls.x3 = 10; // AccessClass 가 math 폴더(같은집) 
//					 // 안에 없기 때문에 사용불가 
//		cls.x4 = 10; 
//		cls.x2 = 10;
		
		// public > protected > default > private 
		
	}

}
