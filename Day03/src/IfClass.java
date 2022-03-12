
// 조건문(조건분기문) - 
// if 
// if ~ else 
// if ~ else if 
// if ~ else if ~ else

public class IfClass {
	
	public static void 
	main(String[] args) {
		
		//-- 취득 점수가 70점 이상일때
		//-- 합격을 출력하고 싶다. 
		
		int point = 65; // 70점 획득 
		
		if(point >= 70) { // 참일때 
			System.out.println("합격");
		} else {// 거짓일때 
			System.out.println("불합격");
		}
		
		//-- A학점은 90 이상 
		//-- B학점은 80 이상 
		//-- C학점은 70 이상 
		//-- D학점은 60 이상 
		//-- 그 외는 F 
		
		if(point >= 90) { // A학점 
			System.out.println("A학점");
		} 
		
		if(point >= 80) { // B학점 
			System.out.println("B학점");
		} 
		
		if(point >= 70) { // C학점
			System.out.println("C학점"); 
			
		}
		
		if(point >= 60) { // D학점
			System.out.println("D학점"); 
			
		}
		
		if(point < 60) { // F학점 
			System.out.println("F학점");
		}
		
		
		// if - else if - else 
		if(point >= 90) {
			System.out.println("A학점");
		} else if(point >= 80) {
			System.out.println("B학점");
		} else if(point >= 70) {
			System.out.println("C학점");
		} else if(point >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		
		/*
		 *  조건 분기문 ( if else ) 
		 
		 if(조건식a) {
		 	조건식a가 참일때 실행 
		 	...
		 } else if(조건식b) {
		 	조건식b가 참일때 실행 
		 } else {
		 	조건식a,b가 모두거짓일때 
		 } 
  
		 * */
		
		point = 80; 
		if(point >= 90) {
			System.out.println("A학점");
		} else if(point >= 60) {
			// 80점인데도 불구하고,
			// 두번째 else if 가 참이기 
			// 때문에 D학점이 출력 (에러) 
			System.out.println("D학점");
		} else if(point >= 80) {
			System.out.println("B학점");
		} else if(point >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}	 
		
		//-- 돈이 없으면 걸어가 
		//-- 가진돈이 1000원 미만이면 '마을버스'
		//-- 가진돈이 2000원 미만이면 '지하철'   
		//-- 가진돈이 1500원 미만이면 '버스'
		//-- 가진돈이 5000원 이상이면 '택시' 
		
		int money = 1200;
		
		if(money >= 5000) {
			
		} else if(money < 1000) {
			
		} else if(money < 1500) {
			
		} else if(money < 2000) {
			
		} else {
			
		}
		
		//if else 로 구성해보세용 
		
		
		
		

		
		
	}
	
}
