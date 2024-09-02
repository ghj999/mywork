package ex7_work;

import java.util.Scanner;

public class Work1 {
	//입력 : aabbcca
	//결과 : abc
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();
		
		ExWork ew = new ExWork();
		ew.getResult(input);
		
	}//main
}
