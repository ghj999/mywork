package ex1_string;

import java.util.Scanner;

public class Ex6_String {
	public static void main(String[] args) {
		
		//입력 : abcabc
		//결과 : a2b2c2
			
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		
		//모든 알파벳, 특문, 숫자등에 대응할 수 있도록 255개의 배열을 생성
		int [] charCount = new int[256];
		
		//입력받은 각 문자의 갯수를 카운트
		for( int i = 0; i < str.length(); i++ ) {
			charCount[ str.charAt(i) ]++; 
		}
		
		//결과 출력
		for ( int i = 0; i < charCount.length; i++ ) {
			if( charCount[i] > 0 ) {
				System.out.printf("%c%d", i, charCount[i]);
			}
		}
	}//main
}
//어려워. 뭐가 어려워. 
