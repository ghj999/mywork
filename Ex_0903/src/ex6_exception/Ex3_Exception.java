package ex6_exception;

import java.util.Scanner;

public class Ex3_Exception {
	public static void main(String[] args) {
		
		//정수 : 100
		//결과 : 100
		
		//정수 : abc
		//abc은(는) 정수가 아닙니다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : " );
		String num = sc.next();
		
		try {
			int n = Integer.parseInt(num);
			System.out.println("결과 : " + n);
		}catch(Exception e) {
			
			System.out.println(num + "은(는) 정수가 아닙니다");
		}
		
		
		
	}//main
}
//정답 궁금
// 정답이 어던지??
// 2명은 완성.   -> 답 보니까. 진짜 별 거 없잖아. 길이도 짧고. 어??

// 이 문제는 next로 받아서 해결이 맞다. 
// 트라이 캐치 하나 잘 만들면 되고. 포문, if문 필요 없어. 트라이 캐치 하나만 잘 만들어져 있으면 돼. 

// 힌트: 넥스트로 값 받고. 인티져 점 파스 인트 잘 쓰면 돼. 

// 지피티 답 보니까. 별 거 아님.



