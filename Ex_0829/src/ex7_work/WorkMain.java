package ex7_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		//입력 : 123
		//123은 숫자입니까? true
		
		//입력 : a12
		//a12은(는) 숫자입니까? : false
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();
		
		IamNumber in = new IamNumber();
		System.out.println(input + "은(는) 숫자임? : " + in.isNumber(input));
		
	}//main
}
