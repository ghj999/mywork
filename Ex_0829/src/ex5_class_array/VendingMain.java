package ex5_class_array;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		ven.init();
		
		System.out.print("insert coin : ");
		ven.showCans( sc.nextInt());

		System.out.print(">> ");
		ven.selectCan( sc.next() );
	}
	
}

//메서드의 파라미터로 ATM으로 보내야 돼. 