
class StaticEx {
	static int count = 0; // ��ü�� ȣ���ϴ� ��  
	static void printVar() {
		System.out.println(count);
	}
}

// java StaticClass
// -> StaticClass.main()

public class StaticClass {
	
	public static void main(String args[]) {
		
		//StaticEx ex = new StaticEx(); 
		StaticEx.count += 1; 
		StaticEx.printVar(); 
		
		//StaticEx ex2 = new StaticEx();
		StaticEx.count += 1; 
		StaticEx.printVar(); 
	}
	
}
