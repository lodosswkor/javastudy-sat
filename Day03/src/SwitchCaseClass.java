// Switch Case
// Switch ~ Case
/*
 * 문법 
   switch(변수) {
   	case 값1 : // 변수 == 값1 (실행)
   	    ... 실행구문 
   		break; 
   	case 값2 : // 변수 == 값2 (실행) 
   		... 실행구문 
   		break; 
    ....
    default: //-- 위의 case중에 참이 없을때
    	... 실행구문 
    	break;
   }
   
 */
public class SwitchCaseClass {

	public static void main(String[] args) {
	
		// 월 - 일 
		// 1(월),2(화),3,4,5,6,7(일)  
		int day = 0; 
		switch(day) {
			case 3:
				System.out.println("수");
				break;
			case 1:
				System.out.println("월");
				break;
			case 2:
				System.out.println("화");
				break;
			case 4:
				System.out.println("목");
				break;
			case 5:
				System.out.println("금");
				break;
			case 6:
				System.out.println("토");
				break;
			case 7:
				System.out.println("일");
				break;
			default:
				System.out.println
				("1에서 7까지의 숫자만 가능합니다.");
				break;
		}
		
		//--> if else if else 
		if(day == 1) {
			
		} else if(day == 2) {
			
		} ///.... 
		else {
			System.out.println("1과 7사이의 값을 입력하세요..");
		}
	}

}
