package ex6_exception;

import java.util.Scanner;

public class Ex2_Exception {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받도록 하고
		//정수가 입력되지 않았을 때도 정상종료가 가능하도록 처리
		//-------------
		//정수 : 5
		//결과 : 5
		
		//정수 : a
		//정수만 입력할 수 있습니다. 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : " );
		
		try {
			int n = sc.nextInt();
			System.out.println("결과 : " + n);
			
		}catch (Exception e) {
			System.out.println("정수만 입력가능");
		}
	
		
	}//main
}


// 트라이, 캐치 가지고. 요 결과 나오게 해볼 것. 
// 이 문제 마스터. 예외처리 문제. 

// 게 간단 한 거네. 