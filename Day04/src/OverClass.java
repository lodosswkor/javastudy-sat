// Overload : ��ø  
// Override : ������ 

class AnimalClass {
	
	
	// ���� �޼ҵ� �̸����� 
	// 1. �Ű������� �ٸ��ų�
	// 2. ����Ÿ���� �ٸ��ų� 
	// �� ��� �޼ҵ�� �ߺ� ���� �����ϴ�. (Overloading) 
	void bark() {
		System.out.println("¢������");
	}
	
	void bark(String action) {
		System.out.println(action);
	}
	
	void bark(int count) {
		System.out.println(count + "�� ¢��");
	}
}


public class OverClass {
	public static void main(String[] args) {
		AnimalClass a = new AnimalClass();
		a.b
	}
}
