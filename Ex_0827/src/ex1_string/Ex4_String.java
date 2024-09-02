package ex1_string;

import java.util.Scanner;

public class Ex4_String {
	public static void main(String[] args) {
		
		//키보드에서 아무 값이나 입력받은 뒤, 
		//입력받은 문장에서 소문자 a의 갯수를 판단하시오. 
		//------------------------
		//입력 : Aaidsfnaaaa
		// a의 갯수 : 6
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("입력 : ");
		String alpha = sc.next();
				
		for (i = 0 ; i < alpha.length(); i++ ) {
			if ( alpha.charAt(i) == 'a') {
				cnt++;
			}
		}//for
		
		System.out.println("a의 갯수 : " + cnt);
							
	}//main			
}//반복문 있어야 
