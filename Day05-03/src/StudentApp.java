import java.util.Scanner;
import kr.students.Student;

public class StudentApp {
	
	final static int stdCount = 100; 
	static int insertedStdCount = 0; 
	//-- �л����� �ִ� 100�� 
	Student std[] = new Student[stdCount];
	
	//-- �л� �Է� �� ���� 
	public static void saveStudent() {
		
	}
	
	//-- �л� �˻�
	public static void searchStudent() {
		
	}
	
	//-- �л� ��� (���) 
	public static void printStudentsByLine() {
		
	}
	
	
	
	public static void main(String args[]) {

		
		do {
			
			Scanner sc = new Scanner(System.in);
			int command = sc.nextInt();
			
			switch(command) {
			
				case 1 : // �л��Է� 
					saveStudent(); 
					break; 
				case 2 : // �л��˻�
					searchStudent();
					break;
				case 0 : // ���α׷� ���� 
				    break;
			}
			
			
			
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
		    
		    System.out.println("\n");
		    
		} while(true);
	    
		
	}
}
