
// import java.util.*;
import java.util.Map;
import java.util.HashMap; 
import java.util.List; 
import java.util.ArrayList; 

public class HashMapEx {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("name", "������");
		map.put("age", 45);
		map.put("grade", "����");
		
		System.out.println("�̸� : " + map.get("name"));
		System.out.println("���� : " + map.get("age"));
		System.out.println("��å : " + map.get("grade"));
		
		//--- List �� ��� 
		List company = new ArrayList(); 
		
		for(int i = 0; i < 50; i++) { 
			Map employee = new HashMap(); 
			employee.put("name", "������_" + i);
			employee.put("age", 45 + i);
			employee.put("grade", "����_" + i);
			company.add(employee);
			
		}
		
		System.out.println(company);
		
		//-- Student ��ü �ֱ� 
		List school = new ArrayList(); 
		
		for(int i = 0; i < 50; i++) { 
			Student std = new Student(); 
			std.setName("������_" + i);
			std.setGrade(i + "�г�");
			std.setAge(45 + i);
			school.add(std);
		}
		
		Student std_1 = (Student)school.get(2);
		std_1.sayName();
		
		
		
	}
	
}
