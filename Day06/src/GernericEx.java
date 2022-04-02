import java.util.*;

public class GernericEx {

	public static void main(String args[]) {
	
		// List 를 만들때 일반 리스트의 경우 
		// List list = new ArrayList();
		// List 를 만들때 제너릭을 사용하는경우
		List<Student> school = new ArrayList<Student>();
		//List school = new ArrayList();
		
		//list.add(Student e)
	
//		Map<String,Student> std_map 
//			= new HashMap<String, Student>();
//		
		//std_map.put
		
		for(int i=0; i<10; i++) {
			Student std = new Student(); 
			std.setName("이종석_" + i);
			std.setGrade(i + "학년");
			std.setAge(45 + i);
			school.add(std);
			
			//-- TEST 
			//List<Student> school :: error
//			Map m = new HashMap();
//			m.put("name", "이종석_" + i);
//			school.add(m);
		}
		
		school.get(3).sayName();
		
		
	}
	
	
}
