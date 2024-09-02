package ex1_string;

import java.util.Scanner;

public class Ex7_String {
	public static void main(String[] args) {

		//입력 : aabab
		//a2b1a1b1    //요 결과 나올 수 있도록 스트링 클래스, 메서드로 해 봐.

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();

		//결과 출력용 변수
		String result = "";
		int count = 1;
		
		for ( int i = 1; i < input.length(); i++) {
			if( input.charAt(i) == input.charAt(i-1)) {
				count++;
			}else {
				result += input.charAt(i-1);
				result += count;
				count = 1;
			}
			
		}//for
		
		//마지막 문자 처리
		result += input.charAt( input.length() - 1 );
		result += count;
		
		System.out.println(result);
		}//main
	}

	//이번에도 문자를 카운팅하는 문제. 약간 결이 다름
	// 정답 궁금
// 이 문제도 마스터. 
//반복 하면 알게 될 것. 