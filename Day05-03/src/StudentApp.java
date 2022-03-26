import java.util.Scanner;
import kr.students.Student;

public class StudentApp {
	
	final static int stdCount = 100; 
	static int insertedStdCount = 0; 
	//-- 학생수는 최대 100명 
	Student std[] = new Student[stdCount];
	
	//-- 학생 입력 및 저장 
	public static void saveStudent() {
		
	}
	
	//-- 학생 검색
	public static void searchStudent() {
		
	}
	
	//-- 학생 출력 (목록) 
	public static void printStudentsByLine() {
		
	}
	
	
	
	public static void main(String args[]) {

		
		do {
			
			Scanner sc = new Scanner(System.in);
			int command = sc.nextInt();
			
			switch(command) {
			
				case 1 : // 학생입력 
					saveStudent(); 
					break; 
				case 2 : // 학생검색
					searchStudent();
					break;
				case 0 : // 프로그램 종료 
				    break;
			}
			
			
			
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
		    
		    std[insertedStdCount++] = std_info;
	
		    System.out.println("입력된 학생 출력하기");
		    System.out.println("이름\t학년\t성별\t점수");
		    
		    for(int i=0;i<insertedStdCount;i++) {
		    	std[i].printMeByLine();
		    }
		    
		    System.out.println("\n");
		    
		} while(true);
	    
		
	}
}
