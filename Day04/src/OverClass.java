// Overload : 중첩  
// Override : 재정의 

class AnimalClass {
	
	
	// 같은 메소드 이름으로 
	// 1. 매개변수가 다르거나
	// 2. 리턴타입이 다르거나 
	// 할 경우 메소드는 중복 정의 가능하다. (Overloading) 
	void bark() {
		System.out.println("짖는행위");
	}
	
	void bark(String action) {
		System.out.println(action);
	}
	
	void bark(int count) {
		System.out.println(count + "번 짖음");
	}
}


public class OverClass {
	public static void main(String[] args) {
		AnimalClass a = new AnimalClass();
		a.b
	}
}
