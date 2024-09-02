package ex2_while;

public class Ex2_while {
	public static void main(String[] args) {
		
		//1 = 1 2 3 4 5
		//2 = 6 7 8 9 10
		//3 = 11 12 13 14 15
		//4 = 16 17 18 19 20
		//5 = 21 22 23 24 25
		
		int num1 = 1;
		int num2 = 1;
		while( num1 <= 5 ) {
			
			System.out.print(num1++ + " = ");
			
			for( int i = 1; i <= 5; i++ ) {
				System.out.print(num2++ + " ");
			}//for

			System.out.println();
			
		}//while		
		
		
	}//main  와일 문 안에 포문 하나 넣어서 만들어 볼 것. 이거는 전역변수를 2개 만들어야 편함
}
