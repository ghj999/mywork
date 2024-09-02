package ex6_atm;

import java.util.Scanner;

import ex5_class_array.Vending;

public class UserMain {
	public static void main(String[] args) {
		
		/*
		 1. 입   금
		 2. 출   금
		 3. 잔액확인
		 etc.종료
		 >> 1
		 ---입 금---
		 입금액 : 1000
		 입금성공
		 ------------
		 1. 입   금
		 2. 출   금
		 3. 잔액확인
		 etc.종료
		 >> 3
		 ---잔액확인---
		 1000원
		  
		  	 
		 */
				
		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();
		
		w : while(true) {
			
			System.out.println("1. 입   금");
			System.out.println("2. 출   금");
			System.out.println("3. 잔액확인");
			System.out.println("etc.종  료");
			System.out.print("> ");
			
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1://입금
				break;
				
			case 2://출금
				System.out.println("---출금---");
				System.out.println("출금액 : ");
				break;
				
			case 3://잔액확인
				break;
				
			default';
			}
			
	}
		
		
		
	}//main
}
