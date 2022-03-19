// class 클래스명 { 
//  .. 클래스 블럭
// }
// -- 1. 속성(필드)는 변수혹은 상수이다. 
// -- 2. 행위(메서드/함수) 
// -- 리턴타입 메서드/함수명(매개변수) { }
// -- 3. 생성자 
// -- 클래스명(매개변수) { }

class PersonClass {
	
	String name; 
	
	public PersonClass() {}  // 기본생성자 
	
	// 사람 클래스는 "이름" 1.속성을 가진다
	public PersonClass(String name) {
		this.name = name; 
	}
	void sayName() { // 2. 행위 
		System.out.println(name);
	}
}

// 각 클래스가 PersonClass를 상속받게 하겠다. 
// 상속의 키워드는 extends
// class 자식클래스명 extends 부모클래스명 

class PersonClassA extends PersonClass {
	public PersonClassA(String name) {
		super(name);
	}

	void sayName() { // 2. 행위 
		System.out.println("PersonA :" + name + "입니다.");
	}
	
	void sayName(String name) {
		
	}
}

class PersonClassB extends PersonClass {
	public PersonClassB(String name) {
		super(name);
	}
	void sayName() { // 2. 행위 
		System.out.println("PersonB :" + name + "입니다.");
	}
} 


class Lancard {
	void connected() {
	}
}

class RealtekLanCard extends Lancard {
	void connected() {
		System.out.println("연결되었습니다.");
	}
}




//-- 실행부
// 자바에서는 객체를 생성한다 할때 사용하는 키워드가 new
// 클래스데이터타입 변수명 = new 생성자(); 

public class Person {
	
	public static void main(String[] args) {
		
		PersonClass p = new PersonClass("이종석");
		PersonClass p1 = new PersonClass("이종석");
		p.sayName();
		p.name = "하악하악";
		p.sayName();
		
		PersonClass pa = new PersonClassA("박은진"); // 다형성 개념
		PersonClass pb = new PersonClassB("김진수");
		pa.sayName();
		pa.sayName("이종석");
		pb.sayName();
		
		/*
		if(p == p1) {
			System.out.println("p와 p1은 같은객체 이다");
		} else {
			System.out.println("p와 p1은 다른객체 이다");
		}
		
		String abc = new String("이종석"); 
		String abc_1 = new String("이종석"); 
		
		if(abc == abc_1) {
			System.out.println("abc와 abc_1은 같다.");
		} else {
			System.out.println("abc와 abc_1은 다르다");
		}
		*/
		
	}
	
}


