
class SharedObject {
	
	static int createdCount = 0;
	static SharedObject sharedObject = null; 
	
	static SharedObject getObject() {
		if(sharedObject == null) {
			createdCount += 1; 
			sharedObject = new SharedObject(); 
		}
		return sharedObject; 
	}
	
	int plugMethod(int x, int y) {
		return x + y; 
	} 
	
	float plugMethod(float x, float y) {
		return x + y; 
	}
}


public class SingletonClass {

	public static void main(String args[]) {
		//SharedObject so = new SharedObject(); 
		SharedObject so1 = SharedObject.getObject(); 
		SharedObject so2 = SharedObject.getObject(); 
		SharedObject so3 = SharedObject.getObject(); 
		
		System.out.println("°´Ã¼¼ö : " 
						   +SharedObject.createdCount); 
		
		so1.plugMethod(10, 20);
		so2.plugMethod(30, 20);
		
		
	}

}
