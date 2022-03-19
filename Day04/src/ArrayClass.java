
// 배열 분법 
// char a
// 1. 데이터타입[] 변수명; (선언) 
// 2. 데이터타입 변수명[]; 
// ---- 데이터 초기화 방식 
// 1. int[] age = {10,20,30,40}; // 선언과 동시에 초기화 
// 2. int[] age = new int[3]; // 선언과 방만 만들어 놓음 
//    age[0] = 10;
//    age[1] = 20;
//    age[2] = 30; 

public class ArrayClass {

	public static void main(String[] arg) {
		
		// 1. 선언과 동시에 값 초기화 
		String week_1[] = {"월","화","수","목","금","토","일"};
		
		for(int i=6;i>=0;i--) {
			System.out.println(week_1[i]);
			week_1[i] += "요일"; // a += 1 -> a = a + 1;
			System.out.println(week_1[i]);
		}
		
		// 2. 선언, 방만들기, 값 초기화(입력) 
		String[] week_2 = new String[7]; 
		week_2[0] = "월";
		week_2[1] = "화";
		week_2[2] = "수";
		week_2[3] = "목";
		week_2[4] = "금";
		week_2[5] = "토";
		week_2[6] = "일";
		
		for(int i=0;i<7;i++) {
			System.out.println(week_2[i]);
			week_2[i] += "요일"; 
			System.out.println(week_2[i]);
		}

		// 
		// !) 배열길이를 구하는 방법(함수) 
		System.out.println
		("배열변수 week_1의 길이 : " + week_1.length);
		
		// a. 배열변수 week_1에 저장되어 있는 
		// 모든값을 출력해봐라(정방향) 
	    for(int i=0; i<week_1.length; i++) {
			System.out.println(week_1[i]);
	    }
	    
	    // 역방향 
	    for(int i=week_1.length-1; i>=0; i++) {
			System.out.println(week_1[i]);
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
