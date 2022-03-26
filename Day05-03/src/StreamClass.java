import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// 입출력 스트림 
// 콘솔 입력과 출력 
// inputStream (입력) 

public class StreamClass {

	public static void main(String args[]) 
			throws Exception {
		
		/*
		InputStream in = System.in; 
		System.out.print("숫자를 입력해 주세요 :");
		
		int readInt = in.read();
		int readB = in.read(); 
		int readC = in.read(); 
		
		System.out.println(readInt); 
		System.out.println(readB); 
		System.out.println(readC); 
		
		in.read(); // 엔터 제거 
		*/ 
		// 나는 Ascii 코드 말고 그냥 내가 쓴 문자 그대로 보이게 
		// 하고 싶어 
	
		/*
		System.out.print("넣어봐:");
		InputStreamReader inr 
		= new InputStreamReader(System.in);
		
		char[] input = new char[3]; 
		inr.read(input);
		System.out.println(input);
		*/ 
		//-- 이놈은 고정길이만 읽을수 있어. 
		//-- 난 가변길이도 다 읽고 싶어. 
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
		
		//-- 아 다 불편해 
		//-- 간편한거 없어? 
		//-- Scanner 
		Scanner sc = new Scanner(System.in);
		System.out.print("Scanner :");
	    String input = sc.next();
		System.out.println(input);
		
		
		
		
	}
}
