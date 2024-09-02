package ex3_work;

import java.util.Scanner;

public class Ex1_switch_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 두 개와 연산자를 입력 받는다
		//입력받은 두 정수의 연산 결과를 출력
		
		//-------------------
		
		//수1 : 15
		//수2 : 20
		//연산자 : *
		//15 * 20 = 300
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String op = sc.next();//+, -, *, /
		
		//결과 출력용 변수
		String result = "";
		
		switch( op ) {
		case "+":
			result = su1 + " + " + su2 + " = " + (su1 + su2);
			break;
			
		case "-":
			result = su1 + " - " + su2 + " = " + (su1 - su2);
			break;
			
		case "*":
			result = su1 + " * " + su2 + " = " + (su1 * su2);
			break;
			
		case "/":
			result = su1 + " / " + su2 + " = " + (su1 / su2);
			break;
			
		default:
			result = "올바른 연산자가 아님";
			break;
		}//switch
		
		System.out.println(result);
		
		
	}//main
}
