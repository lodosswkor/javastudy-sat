
public class Student {

	private String name; 
	private int age;
	private String grade; 
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return this.name; 
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void sayName() {
		System.out.println(
			"내 이름은 " + name + "입니다."
		);
	}
}
