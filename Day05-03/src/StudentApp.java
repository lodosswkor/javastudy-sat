import java.util.Scanner;
import kr.students.Student;

public class StudentApp {
	
	final static int stdCount = 100; 
	static int insertedStdCount = 0; 
	
	public static void main(String args[]) {
		
		//-- �л����� �ִ� 100�� 
		Student std[] = new Student[stdCount];
		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		String grade, point; 
		
	    System.out.println("�л������� �Է��ϼ���");
	    System.out.print("�̸� : ");
	    name = sc.nextLine(); 
	    
	    System.out.print("�г� : ");
	    grade = sc.nextLine();
	    
	    System.out.print("���� : ");
	    gender = sc.nextLine(); 
	    
	    System.out.print("���� : ");
	    point = sc.nextLine(); 
	    
	    Student std_info = new Student();
	    std_info.setName(name);
	    std_info.setGrade(grade);
	    std_info.setGender(gender);
	    std_info.setPoint(point);
	    
	    std[insertedStdCount++] = std_info;

	    System.out.println("�Էµ� �л� ����ϱ�");
	    System.out.println("�̸�\t�г�\t����\t����");
	    
	    for(int i=0;i<insertedStdCount;i++) {
	    	std[i].printMeByLine();
	    }
	    
	    System.out.println("\n\n");
	    
		
	}
}
