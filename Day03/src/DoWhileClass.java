// Do while 
// do {
//    실행부 
// } while(조건식);
// 조건식이 밑에 있기때문에,
// do { } 의 실행부는 최소 한번은 실행된다. 

public class DoWhileClass {

	public static void main
	(String[] args) {
		
		// 1 - 10까지 출력하는놈을 만들어라 
		int i = 1; 
		
		do {
			System.out.println(i++);
		} while(i < 1); 
	
		
		//-- break, continue
		//-- 나는 z가 5일때까지만 출력하고 싶다. 
		int z=0;
		for(;z<=10;z++) {	
//			if(z<=5) { 총 11번 연산 
//				System.out.println(z);
//			}
			if(z>5) break; 
			System.out.println(z);
		}
		
		
		// 1-100 까지의 수중 2의 배수는?
		int z1 = 1;
		for(;z1<=10;z1++) {
			if(z1 % 2 == 0) {
				System.out.println(z1); 
				break;
			}
			// ... 
		}
		System.out.println("연산수:" + z1);
		
	}
	
	
	
	
}
