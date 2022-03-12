
// For 반복문 ( For loop )
/*
 *  for문의 문법 
 *  
	for(초기화식; 조건식; 증감식) {
		실행문 ....
	}
	
	조건식이 참(true)일 경우에 실행 되며,
	조건식의 거짓(false)일때 까지 반복실행 된다.
	
*/
//
public class ForLoopClass {
	
	public static void main(String[] args) {
			
		// 1에서 100까지 출력해보자.
		// 반복문이 없는경우 
		// System.out.println(1);
		// System.out.println(2);
		// System.out.println(3);
		//.. 100 개를 찍어야한다. 
		//int num=1;
//		for(int num=1; num<=10;num++) {
//			System.out.println(num);
//		}
//		
//		//-- 10 ~ 1 출력하고싶다 
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
//		
		//-- for문과 if문을 사용해서
		//-- 1에서 100까지의 숫자중에
		//-- 2의 배수만 출력해라. 
//		for(int x=1;x<=100;x++) {
//			if(x%2 == 0) {
//				System.out.println(x);
//			}
//		}
//		
		//-- 중첩된 for문으로 구구단을 출력해 보자
		//-- x * y = z 
		//-- x가 고정, y가 가변 
		//-- 단수 2 ~ 9
		for(int x=2; x<=9; x++) {
			for(int y=1; y<=9; y++) {
				System.out.println
				(x + "x" + y + "=" + (x * y));        
			}
		}
		
		//-- 
		//-- x x y = z 
		//-- y를 고정으로 x를 가변으로 
//		
//		for(int y=1;y<=9;y++) {
//			for(int x=2; y<=9; x++) {
//				System.out.print
//				(x + "x" + y + "=" + (x * y) + "\t");
//			}
//			System.out.print("\n");
//		}
		
		
		int z = 10; 
		
		for(;z<=50;z+=10) {
			
		} 
		
		System.out.println(z); // ? 
		
		
	}

}
