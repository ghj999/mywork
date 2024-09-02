package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
			
		//키보드에서 입력받은 값 까지 반복하는 피보나치 수열 만들기
		//----------------------
		//정수 : 7
		//1 1 2 3 5 8 13
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int cnt = sc.nextInt();
		
		int n1 = 1;
		int n2 = 0;
		int n3 = 0;
		
		for( int i = 0; i < cnt; i++ ) {
			
			n2 = n3;
			n3 = n1;
			n1 = n2 + n3;
			System.out.print( n3 + " " );
			
		}//for
		
	}//main
}
