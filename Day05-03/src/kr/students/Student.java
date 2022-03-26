package kr.students;

public class Student {

	private String name;
	private String gender;
	private String grade; 
	private String point;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	//-- �л����� �������� ����ϴ� �޼ҵ�
	public void printMe() {
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + point);
	}
	
	//-- �л������� ��������� ����ϴ� �޼ҵ� 
	public void printMeByLine() {
		System.out.println(
				name + "\t" + 
				grade + "\t" + 
				gender + "\t" + 
				point ); 
	}
	
	
	
}
