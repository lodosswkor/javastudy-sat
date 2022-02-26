
// 1. 주석문 
// 컴파일러는 해석을 안하고 넘어가는 문장들 
// 사용목적은 : 개발자(사람)이 읽고 참고하도록 써넣은 정보.

// a) 한줄주석 
// <-- 한줄주석 
// b) 여러줄 주석
/*
   여러줄 주석입니다.
   냐옹냐옹 
   Author : lodossw@gmai.com
   Action : 살려줘
 */

// 2. 자바 소스코드의 기본 구조 
// a) 클래스 블록 (필수) 
// b) 메서드 블록 (옵션) 
// HelloWorld 클래스 
public class HelloWorld
 { // 클래스 블록 

	// HelloWorld 프로그램의 시작포인트 

	public static void main(String[] args) { // 메소드 블록 
		System // 클래스
		.out // 변수(맴버) 
		.println("하악하악, HelloWorld"); // 메소드 
	}
	
	
}


// 3. 기본 문법. 
// a) 문장의 끝은 무조건 ; 
// b) class명의 시작은 대문자로 한다 (옵션)
// c) 메소드명, 변수명의 시작은 소문자로 한다 (옵션)

// 4. 자바의 명명규칙 (옵션) 
/* 
 * a) 자바 클래스 명명규칙 카멜케이스(쌍봉낙타) / PascalCase 
   
   Hello + World -> HelloWorld
   I + am + a + boy -> IAmABoy 
 
   b) 자바 변수/메소드 명명규칙은 카멜케이스(단봉낙타)
   (시작은 소문자, 접합단어의 시작은 대문자) 
   Hello + World -> helloWorld 
   I + am + a + boy -> iAmABoy 
 
   4) 자바는 대소문자를 구분합니다. 
   HelloWorld 
   helloWorld
   helloworld 
   helLoworld 
   
 */




