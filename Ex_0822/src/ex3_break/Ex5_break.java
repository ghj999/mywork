package ex3_break;

import java.util.Scanner;

public class Ex5_break {
	public static void main(String[] args) {
		
		//키보드에서 정수 두 개를 입력받아, 두 수의 최대공약수 구하기
		//------------------
		//수1 : 10
		//수2 : 4
		//최대공약수 : 2
		
		//수1 : 3
		//수2 : 7
		//최대공약수 없습니다
				
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int su2 = sc.nextInt();
		
		if ( su1 > su2 ) {
			int su3 = su1;
			su1 = su2;
			su2 = su3;
		}
		
		int i = su1;
		
		for( ; i >= 1; i-- ) {
			if( su1 % i == 0 && su2 % i == 0 ) {
				break;
			}
		}//for
		
		if (i == 1) {
			System.out.println("최대공약수 없음");
		}else {
			System.out.println("최대공약수 : " + i);
		}
		
	}//main, 10 4나, 4 10이 똑같이 나와야. 스왑 하셔야 한다는 얘기. 
	//가장 큰 거를 어떻게 표현하지?
}
