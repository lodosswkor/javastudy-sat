import java.util.*;

public class GernericEx {

	public static void main(String args[]) {
	
		// List �� ���鶧 �Ϲ� ����Ʈ�� ��� 
		// List list = new ArrayList();
		// List �� ���鶧 ���ʸ��� ����ϴ°��
		List<Student> school = new ArrayList<Student>();
		//List school = new ArrayList();
		
		//list.add(Student e)
	
//		Map<String,Student> std_map 
//			= new HashMap<String, Student>();
//		
		//std_map.put
		
		for(int i=0; i<10; i++) {
			Student std = new Student(); 
			std.setName("������_" + i);
			std.setGrade(i + "�г�");
			std.setAge(45 + i);
			school.add(std);
			
			//-- TEST 
			//List<Student> school :: error
//			Map m = new HashMap();
//			m.put("name", "������_" + i);
//			school.add(m);
		}
		
		school.get(3).sayName();
		
		
	}
	
	
}
