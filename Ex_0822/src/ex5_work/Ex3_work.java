package ex5_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 두 개를 입력받아, 입력받은 두 수의 최소공배수 구하기
		//---------------------
		//수1 : 2
		//수2 : 5
		//최소공배수 : 10
		
		//수1 : 4
		//수2 : 6
		//최소공배수 : 12
		
		//수1 : 3
		//수2 : 3
		//최소공배수 : 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int n2 = sc.nextInt();
		
		for( int i = 1; i <= n1 * n2; i++ ) {
			if( i % n1 == 0 && i % n2 == 0 ) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		}//for
	
		
	}
}
