package ex2_single_for;

import java.util.Scanner;

public class Ex5_singleFor {
	public static void main(String[] args) {

		//키보드에서 정수 n을 입력받는다
		//1부터 n까지의 합을 계산하여 결과를 출력
		//------------------
		//정수 : 5
		//결과 : 15

		//정수 : 10
		//결과 : 55

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("정수 : ");
		int n = sc.nextInt();

		for (int i = 1 ; i <= n ; i++ ) {
			sum += i; 
		}//for
		System.out.print("결과 : " + sum);
				
	}//main
}
