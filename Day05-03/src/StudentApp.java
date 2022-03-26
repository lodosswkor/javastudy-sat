import java.util.Scanner;
import kr.students.Student;

public class StudentApp {
	
	final static int stdCount = 100; 
	
	public static void main(String args[]) {
		
		//-- 학생수는 최대 100명 
		Student std[] = new Student[stdCount];
		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		String grade, point; 
		
	    System.out.println("학생정보를 입력하세요");
	    System.out.print("이름 : ");
	    name = sc.nextLine(); 
	    
	    System.out.print("학년 : ");
	    grade = sc.nextLine();
	    
	    System.out.print("성별 : ");
	    gender = sc.nextLine(); 
	    
	    System.out.print("점수 : ");
	    point = sc.nextLine(); 
	    
	    Student std_info = new Student();
	    std_info.setName(name);
	    std_info.setGrade(grade);
	    std_info.setGender(gender);
	    std_info.setPoint(point);
		
	    std_info.printMe(); 
		
	}
}
