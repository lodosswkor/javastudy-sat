
// 2차원(다차원) 배열선언 
// 1. int[][] a; 
// 2. int a[][]; 

// 배열 선언 및 초기화 방법 
// int a[] = {10,20,30};
// 1. int[][] a = {{10,20},{30,40},{50,60}};
// 2. int[][] a = new int[3][2]; 
// a[0][0] = 10;
// a[0][1] = 20;
// a[1][0] = 30;
// a[1][1] = 40; ....


public class MultipleArrayClass {

	public static void main(String args[]) {
		
		int[][] ages = {
				{10,20},
				{30,40} 
		};
		
		for(int i=0; i<ages.length ;i++) {
			
			for(int j=0; j<ages[i].length ;j++) {
				System.out.println(ages[i][j]);
			}
			
		}
		
		
	}
}
