package ex2_single_for;

import java.util.Scanner;

public class Ex6_singleFor {
	public static void main(String[] args) {
		
		//키보드에서 정수 n1, n2를 입력받는다
		//n1부터 n2까지의 합을 계산하여 결과를 출력
		//단 n1, n2의 순서를 다르게 입력받아도 결과는 똑같이 출력
		//----------------------
		//수1 : 2
		//수2 : 5
		//결과 : 14
		
		//수1 : 5
		//수2 : 3
		//결과 : 12
		
		Scanner sc = new Scanner(System.in);
		System.out.print("c수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
		int result = 0;
		
		if( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		
		for( int i = n1; i <= n2; i++) {
			result += i;
		}
		
		System.out.println("결과 : " + result);
		
		}//for
		
		System.out.print("결과 : " + sum);
		
	}//main
}
