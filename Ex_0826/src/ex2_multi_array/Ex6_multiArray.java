package ex2_multi_array;

public class Ex6_multiArray {
	public static void main(String[] args) {
		
		//2차원 배열 array에서 5를 초과하는 첫번째 값을 찾아 출력하시오. 
		//----------------
		//결과 : 6
		int[][] array = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
		// (선) 1부터 9까지 다 출력한다 생각하고 짜볼 것. 
		// out이라는 레이블. 
		out : for ( int i = 0; i < array.length; i++ ) {
			for ( int j = 0; j < array[i].length; j++) {
				if( array[i][j] > 5) {
					System.out.print(array[i][j] + " ");
					break out;
				}
			}//inner
			System.out.println();
		}//outer
				
	}//main
}



