// Switch Case
// Switch ~ Case
/*
 * ���� 
   switch(����) {
   	case ��1 : // ���� == ��1 (����)
   	    ... ���౸�� 
   		break; 
   	case ��2 : // ���� == ��2 (����) 
   		... ���౸�� 
   		break; 
    ....
    default: //-- ���� case�߿� ���� ������
    	... ���౸�� 
    	break;
   }
   
 */
public class SwitchCaseClass {

	public static void main(String[] args) {
	
		// �� - �� 
		// 1(��),2(ȭ),3,4,5,6,7(��)  
		int day = 0; 
		switch(day) {
			case 3:
				System.out.println("��");
				break;
			case 1:
				System.out.println("��");
				break;
			case 2:
				System.out.println("ȭ");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("��");
				break;
			case 7:
				System.out.println("��");
				break;
			default:
				System.out.println
				("1���� 7������ ���ڸ� �����մϴ�.");
				break;
		}
		
		//--> if else if else 
		if(day == 1) {
			
		} else if(day == 2) {
			
		} ///.... 
		else {
			System.out.println("1�� 7������ ���� �Է��ϼ���..");
		}
	}

}
