
// import java.util.*;
import java.util.Map;
import java.util.HashMap; 
import java.util.List; 
import java.util.ArrayList; 

public class HashMapEx {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("name", "이종석");
		map.put("age", 45);
		map.put("grade", "팀장");
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("나이 : " + map.get("age"));
		System.out.println("직책 : " + map.get("grade"));
		
		//--- List 에 사용 
		List company = new ArrayList(); 
		
		for(int i = 0; i < 50; i++) { 
			Map employee = new HashMap(); 
			employee.put("name", "이종석_" + i);
			employee.put("age", 45 + i);
			employee.put("grade", "팀장_" + i);
			company.add(employee);
			
		}
		
		System.out.println(company);
		
		//-- Student 객체 넣기 
		List school = new ArrayList(); 
		
		for(int i = 0; i < 50; i++) { 
			Student std = new Student(); 
			std.setName("이종석_" + i);
			std.setGrade(i + "학년");
			std.setAge(45 + i);
			school.add(std);
		}
		
		Student std_1 = (Student)school.get(2);
		std_1.sayName();
		
		
		
	}
	
}
