import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// ����� ��Ʈ�� 
// �ܼ� �Է°� ��� 
// inputStream (�Է�) 

public class StreamClass {

	public static void main(String args[]) 
			throws Exception {
		
		/*
		InputStream in = System.in; 
		System.out.print("���ڸ� �Է��� �ּ��� :");
		
		int readInt = in.read();
		int readB = in.read(); 
		int readC = in.read(); 
		
		System.out.println(readInt); 
		System.out.println(readB); 
		System.out.println(readC); 
		
		in.read(); // ���� ���� 
		*/ 
		// ���� Ascii �ڵ� ���� �׳� ���� �� ���� �״�� ���̰� 
		// �ϰ� �;� 
	
		/*
		System.out.print("�־��:");
		InputStreamReader inr 
		= new InputStreamReader(System.in);
		
		char[] input = new char[3]; 
		inr.read(input);
		System.out.println(input);
		*/ 
		//-- �̳��� �������̸� ������ �־�. 
		//-- �� �������̵� �� �а� �;�. 
		//-- BufferedReader 
		// in < inr < br 
		/*
		InputStream in = System.in; 
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader binr = new BufferedReader(inr); 
		
		System.out.print("BufferedReader : ");
		String input = binr.readLine();
		System.out.println(input); 
		*/ 
		
		//-- �� �� ������ 
		//-- �����Ѱ� ����? 
		//-- Scanner 
		Scanner sc = new Scanner(System.in);
		System.out.print("Scanner :");
	    String input = sc.next();
		System.out.println(input);
		
		
		
		
	}
}
