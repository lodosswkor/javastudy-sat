
// 생성자 심화 
// 생성자는 리턴타입이 없는 메서드 
// 이름은 클래스명과 같아야 한다.
// ex) public Animal(String name) {
// }

class Animal {
	String strBark = "멍멍"; 
	
	public Animal() {} // 기본생성자도 정의한다. 
	public Animal(String bark) {
		strBark = bark;
	}
	
	void bark() {
		System.out.println("짖는행위");
	}
}

class Human extends Animal {
	
	String name; 
	int age; 
	
	// 생성자 오버로딩
	Human() {}
	Human(String n, int a) { // 생성자
		name = n;
		age = a; 
	}
	// 
	
	void bark() {
		System.out.println("난 짐승이 아냐.");
		System.out.println("난 " + age + "살 " + name + "임");
	}
}



public class AnimalProgram {

	public static void main(String[] args) {
	    Animal a = new Animal(); // 기본생성자 
	    a.bark();
	    
	    Human h = new Human("이종석", 45);
	    h.bark();
	    
	    //-- 
	    Human h1 = new Human();
	    h1.name = "이종석";
	    h1.age = 45; 
	    
	    System.out.println(h1.name);
	    
	}
}
