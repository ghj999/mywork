package ex6_method_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		//수1 : 10
		//수2 : 5
		//연산자 : *
		//10 * 5 = 50
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : );
		int su1 = sc.nextInt();

		System.out.print("수2 : );
		int su2 = sc.nextInt();
	
		System.out.print("연산자 : );
		String op = sc.next();
		
		CalPrint cp = new CalPrint();
		cp.printResult(su1, su2, op);
		
		
		
		 
		 
	}//main
}

// 입력받는 곳하고, 출력받는 곳을 나눴어. 
// 이걸 어케 알아. 
