
// ������ ��ȭ 
// �����ڴ� ����Ÿ���� ���� �޼��� 
// �̸��� Ŭ������� ���ƾ� �Ѵ�.
// ex) public Animal(String name) {
// }

class Animal {
	String strBark = "�۸�"; 
	
	public Animal() {} // �⺻�����ڵ� �����Ѵ�. 
	public Animal(String bark) {
		strBark = bark;
	}
	
	void bark() {
		System.out.println("¢������");
	}
}

class Human extends Animal {
	
	String name; 
	int age; 
	
	// ������ �����ε�
	Human() {}
	Human(String n, int a) { // ������
		name = n;
		age = a; 
	}
	// 
	
	void bark() {
		System.out.println("�� ������ �Ƴ�.");
		System.out.println("�� " + age + "�� " + name + "��");
	}
}



public class AnimalProgram {

	public static void main(String[] args) {
	    Animal a = new Animal(); // �⺻������ 
	    a.bark();
	    
	    Human h = new Human("������", 45);
	    h.bark();
	    
	    //-- 
	    Human h1 = new Human();
	    h1.name = "������";
	    h1.age = 45; 
	    
	    System.out.println(h1.name);
	    
	}
}
