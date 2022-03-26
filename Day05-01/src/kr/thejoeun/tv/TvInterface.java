package kr.thejoeun.tv;
// 인터페이스는 class가 아닌 interface다
// 따라서 정의할때는 class 클래스명이 아닌
// interface 인터페이스명 

public interface TvInterface {

	void turnOnTv(); 
	void turnOffTv();
	void volumnUp();
	void volumnDown(); 
	default void turn() {
		System.out.println("하악");
	}
	
}
