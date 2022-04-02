/*
import java.util.List;
import java.util.ArrayList;
*/

import java.util.*;


public class ListEx {

	public static void main(String[] args) {
		
		//List list = new List(); // List �� �������̽��� ������
								// ���������δ� ��ü�� ������ �� 
								// ����. 
		List list = new ArrayList(100); // List �������̽��� ����

	    System.out.println(list);
	    System.out.println("���� :" + list.size()); 
	    
	    list.add(1); // ȣ���Ҷ� ���� ArrayList�� ���̿� ����
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    //list.add(3, 5); // ArrayList ���ǿ� ������ ��ġ�� ����.
	    
	    System.out.println(list);
	    System.out.println("���� :" + list.size()); 
		
	    for(int i = 0; i < list.size(); i++) {
	    	System.out.println(list.get(i)); 
	    	// �迭�� list[i] ����Ʈ�� ��ü�̱� ������ .get() 
	    }
	    
	    //list.set(2, 100);
	    list.add(2, 200);
	    //list.set(100,200); // ArrayList�� ���̸� �Ѿ�ϱ�.
	    System.out.println(list);
	    
	    
	    //-- ���� For �� 
	    for(var obj : list) {
	    	System.out.println(obj);
	    }
	    
	    // contains 
	    if(list.contains(200)) {
	    	
	    	int index = list.indexOf(200);
	    	System.out.println("���� 200�� �����մϴ�. �ε���" + index);
	    	System.out.println(list.get(index)); 
	    	
	    } else {
	    	System.out.println("���� 200�� �������� �ʽ��ϴ�.");
	    }
	    
	    // indexOf �� ��ġ 
	    if(list.indexOf(1000) < 0) { // ���� ���� 
	    	System.out.println("���� 1000�� �������� ����");
	    } else { // ���� �ִ°� 
	    	System.out.println("���� 1000�� ������");
	    }
	    
	    
	    // remove 
	    list.remove(2); 
	    System.out.println(list + ":" + list.size());
	    
	}
	
	
}
