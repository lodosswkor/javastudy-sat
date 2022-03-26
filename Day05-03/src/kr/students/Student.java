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

	//-- 학생정보 상세정보를 출력하는 메소드
	public void printMe() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("성별 : " + gender);
		System.out.println("점수 : " + point);
	}
	
	//-- 학생정보를 목록형으로 출력하는 메소드 
	public void printMeByLine() {
		System.out.println(
				name + "\t" + 
				grade + "\t" + 
				gender + "\t" + 
				point ); 
	}
	
	
	
}
