package ex6_label;

import java.util.Scanner;

public class Ex4_label_work {
	public static void main(String[] args) {
		
		//2 ~ 12사이의 n값을 키보드에서 입력 받는다
		//1부터 6까지의 숫자로 이루어진 두 개의 주사위가 던져졌을 때, 
		//합이 키보드에서 입력받은 n값이 되는 첫 번째 경우의 수를 출력
		//-----------------------
		//값 : 13
		//올바른 범위의 값을 입력하세요
		
		//값 : 5
		//(1, 4)
		
		//값 : 11
		//(5, 6)
	
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			System.out.print("값 : ");
			n = sc.nextInt();
		
			if( n >= 2 && n <= 12 ) {
				break;
			}
			
			System.out.println("올바른 범위의 값을 입력하세요");
			
		}//while
		
		outer : for( int i = 1; i <= 6; i++ ) {
			
			for( int j = 1; j <= 6; j++) {
				if( i + j == n ) {
					System.out.printf("(%d, %d )", i, j);
					break outer;
				}
				
			}//inner
			
		}//outer
	}//main
}//for문 써야겠고
//올바른 범위를 받아야. 프로그램이 끝나도록 짤 것. 
//전혀 모르네 ㅜㅜㅜ
