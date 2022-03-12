// While 문 
//  
// while(조건식) {
//  실행구문 
// }

public class WhileLoopClass {

	public static void main
	(String[] args) {
		
		//-- 1부터 10까지 출력하라 
		// for(int i=1; i<=10; i++)
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		int x = 2;
		int y = 1;
		while(x<=9) {
			while(y<=9) {
				System.out.println
				(x + "x" + y + "=" + (x*y)); 
				y++;
			}			
			x++; 
			y=1;
		}
		
	}
}
