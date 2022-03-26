import java.util.Scanner;
import kr.students.Student;

public class StudentApp {
	
	final static int stdCount = 100; // 총학생수 
	static int insertedStdCount = 0; // 현재 입력된 배열의 index
	static Student std[] = new Student[stdCount];
	//-- 학생배열 
	
	//-- 학생 입력 및 저장 
	public static void saveStudent() {

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
	    
	    std[insertedStdCount++] = std_info;

	    System.out.println("입력된 학생 출력하기");
	    System.out.println("이름\t학년\t성별\t점수");
	    
	    for(int i=0;i<insertedStdCount;i++) {
	    	std[i].printMeByLine();
	    }
	    
	    System.out.println("\n");
	}
	
	//-- 학생 검색
	public static void searchStudent() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색하실 학생이름을 입력해 주세요:");
		String name = sc.nextLine();
		
		for(int i=0;i<insertedStdCount;i++) {
		   if(std[i].getName().equals(name)) {
			   std[i].printMeByLine();
		   }
		}
		
	}
	
	//-- 학생 출력 (목록) 
	public static void printStudentsByLine() {
		
	}
	
	
	
	public static void main(String args[]) {

		
		boolean exitProgram = false; 
		
		do {	
			Scanner sc = new Scanner(System.in);
			System.out.print("명령어 입력(1:학생입력,2:학생검색) :");
			int command = sc.nextInt();
			
			
			switch(command) {
				case 1 : // 학생입력 
					saveStudent(); 
					break; 
				case 2 : // 학생검색
					searchStudent();
					break;
				case 0 : // 프로그램 종료 
					exitProgram = true;
				    break;
			}
		    
		} while(!exitProgram);
	    
		
	}
}
