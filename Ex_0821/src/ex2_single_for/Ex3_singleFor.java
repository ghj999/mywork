package ex2_single_for;

import java.util.Scanner;

public class Ex3_singleFor {
	public static void main(String[] args) {
		
		//1부터 10까지의 숫자 중에서 홀수의 합을 계산하여 출력
		
		int sum = 0 ;
		for( int i = 1 ; i <= 10; i++ ) {
			
			if( i % 2 == 1 ) {
				sum += i;
			}
		}//for	for문을 나와서. sum 출력. 
		System.out.println(sum);
		
		sum = 0;
		for( int i = 1; i <= 10; i += 2 ) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("----------------");
		
		//키보드에서 원금과 예치일을 입력 받는다
		//은행 이자는 하루에 1원씩 추가된다
		//예치일수가 끝나면 나의 원금이 얼마가 되었는지를 출력
		//-------------------
		//원금 : 1000
		//예치일 : 
		//5일 후의 원금은 1005원 입니다  // 이렇게 출력되도록 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원금 : ");
		int money = sc.nextInt();
		
		System.out.print("예치일 : ");
		int day = sc.nextInt();
		
		for( int i = 0; i < day * 1; i ++ ) {
			money++;
		}//for
		
		System.out.printf("%d일 후의 원금은 %d원 입니다", day, money);
		
	}//main
}
