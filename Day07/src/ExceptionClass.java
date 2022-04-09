
import java.util.*;
// 예외처리 방식 1: try {} catch{} finally {}
// 예외처리 방식 2: throws 예외 
public class ExceptionClass {

	public static void main(String[] args) {
		
		boolean loop = true; 
		
		while(loop) {
			System.out.print("숫자를 입력해 주세요");
			Scanner sc = new Scanner(System.in);
			int val = 0; 
			
			try {
				val = sc.nextInt(); //-- 데이터베이스 커넥션
				// 데이터베이스 클로즈 
				//-- 이부분이 예외를 발생시키는 구간
				loop = false; 
			} catch(InputMismatchException e) {
				System.out.println("ill error");
				loop = true; 
				continue; 
			} catch(Exception e) {
				System.out.println
				("프로그램은 숫자만 입력 받을 수 있어요!!\n");
				loop = true; 
				continue;
			} finally {
				// 데이터베이스 클로즈 
			}
			
			System.out.println("넣은 숫자 : " + val); 
				
		}
		
	}
}
