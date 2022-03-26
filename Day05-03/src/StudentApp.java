import java.util.Scanner;
import kr.students.Student;

public class StudentApp {
	
	final static int stdCount = 100; // ���л��� 
	static int insertedStdCount = 0; // ���� �Էµ� �迭�� index
	static Student std[] = new Student[stdCount];
	//-- �л��迭 
	
	//-- �л� �Է� �� ���� 
	public static void saveStudent() {

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
	    
	    System.out.println("\n");
	}
	
	//-- �л� �˻�
	public static void searchStudent() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��Ͻ� �л��̸��� �Է��� �ּ���:");
		String name = sc.nextLine();
		
		for(int i=0;i<insertedStdCount;i++) {
		   if(std[i].getName().equals(name)) {
			   std[i].printMeByLine();
		   }
		}
		
	}
	
	//-- �л� ��� (���) 
	public static void printStudentsByLine() {
		
	}
	
	
	
	public static void main(String args[]) {

		
		boolean exitProgram = false; 
		
		do {	
			Scanner sc = new Scanner(System.in);
			System.out.print("��ɾ� �Է�(1:�л��Է�,2:�л��˻�) :");
			int command = sc.nextInt();
			
			
			switch(command) {
				case 1 : // �л��Է� 
					saveStudent(); 
					break; 
				case 2 : // �л��˻�
					searchStudent();
					break;
				case 0 : // ���α׷� ���� 
					exitProgram = true;
				    break;
			}
		    
		} while(!exitProgram);
	    
		
	}
}
