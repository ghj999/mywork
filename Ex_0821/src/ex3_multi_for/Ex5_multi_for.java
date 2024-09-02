package ex3_multi_for;

public class Ex5_multi_for {
	public static void main(String[] args) {
		
		//* * * * * 
		//1 2 3 4 5
		//* * * * *
		//1 2 3 4 5 
		//* * * * *
		
		for( int i = 1; i <= 5 ; i++) {

			for( int j = 1; j <= 5 ; j++ ) {

				if( i % 2 != 0) {
					System.out.print("* ");
				}else {
					System.out.print(j + " ");
				}
			}//inner

			System.out.println();   // 안쪽 포문 나와서 줄바꿈 하는 거
		}//outer
		
		
	}//main
}
