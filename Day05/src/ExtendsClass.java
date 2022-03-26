import math.MathUtilClass;
import kr.co.thejoeun.homework01.Test;


class MathUtilClassSon extends MathUtilClass {
	
}

public class ExtendsClass {

	public static void main(String args[]) {
		/*	
		public int x1; //-- 전체공유  
		private int x2; //-- 자기만(MathUtilClass) 사용 
		protected int x3; //-- 같은 집에 있는 사람만 사용 
		int x4; //-- 같은 방에 있는 사람만 사용 
		*/
		
		/*
		MathUtilClassSon son = new MathUtilClassSon(); 
		son.x1 = 10; 
		son.x2 = 10; // x2 받을수 없어요
		son.x3 = 10; // x3 받을수 없어요 
		*/
		
		Test ta = new Test(); 
		System.out.print(ta.isActive());
		
		
	}
	
}
