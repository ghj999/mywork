package ex2_scanner;

import java.util.Scanner;

public class Ex3_Scanner {
	public static void main(String[] args) {

		// 출력할 달 : 8
		// 8월은 31일까지 있습니다

		Scanner s = new Scanner(System.in);

		System.out.print("몇 월? : ");
		int month = s.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일 까지 있습니다");
			break;

		case 2:
			System.out.println("2월은 28일까지 있습니다");
			break;

		}// switch

	}
}
