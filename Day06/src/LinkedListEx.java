
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {
		
		List arrList = new ArrayList(); 
		List linkedList = new LinkedList(); 
		

		//-----------------------------------
		//-- ArrayList �߰�  
		//-----------------------------------
		long addStart = System.currentTimeMillis(); 
		for(int i = 0; i < 100000; i++) {
			arrList.add(i);
		}
		long addEnd = System.currentTimeMillis(); 
		System.out.println("ArrayList �߰��ӵ� " 
						   + (addEnd - addStart));
		
		//-----------------------------------
		//-- LinkedList �߰�  
		//-----------------------------------

		addStart = System.currentTimeMillis(); 
		for(int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		addEnd = System.currentTimeMillis(); 
		System.out.println("linkedList �߰��ӵ� " 
						   + (addEnd - addStart));

		//-----------------------------------
		//-- ��ȸ�˻� (ArrayList) 
		//-----------------------------------
		
		long start = System.currentTimeMillis(); 
		//2022.04.02 11:22:10:0000

		for(int i = 0; i < arrList.size(); i++) {
			arrList.get(i);
		}
		
		long end = System.currentTimeMillis(); 
		//2022.04.02 11:22:20:0000
		System.out.println("ArrList get �ӵ� : " 
							+ (end - start));
		
		//-----------------------------------
		//-- ��ȸ�˻� (LinkedList)
		//-----------------------------------
		start = System.currentTimeMillis(); 
		//2022.04.02 11:22:10:0000

		for(int i = 0; i < linkedList.size(); i++) {
			linkedList.get(i);
		}
		
		end = System.currentTimeMillis(); 
		//2022.04.02 11:22:20:0000
		System.out.println("LinkedList get �ӵ� : " 
							+ (end - start));
		
	}
	
	
}
