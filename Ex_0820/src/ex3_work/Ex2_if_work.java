package ex3_work;

import java.util.Scanner;

public class Ex2_if_work {
	public static void main(String[] args) {

		//윤년 구하기
		//윤년 : 
		//1.연도가 4로 나눠 떨어지면 윤년
		//2.연도가 100으로 나누어 떨어지는 해는 평년
		// -> 4년 주기에 포함되어 있어도 100으로 나눠 떨어지면 평년
		//3.100으로 나눠지더라도 400으로도 함께 나눠진다면 윤년

		//년도 : 2024 
		//2024년은 윤년입니다  -라고 출력되도록. 2024를 받으면. 

		//년도 : 2000  - 1조건은 되는데, 2번째 조건도 맞아. 3번째거를 봐야 해. 
		//2000년은 윤년입니다

		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : ");
		int year = sc.nextInt();

		if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			System.out.println(year + "은 윤년입니다");
		}else {
			System.out.println(year + "은 평년입니다");
		}
	

	}// main
}
