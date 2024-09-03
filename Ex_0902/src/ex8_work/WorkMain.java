package ex8_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		//키보드에서 입력받은 문장의 홀수번째 문자만 추출하여 결과로 보여주기
		//-----------------------------
		//입력 : helloworld
		//hlool(홀수번째 자리 문자만 출력)
		
		//if문 써서랑, 안 써서랑. 2가지로.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();
		
		Work wk = new Work();
		wk.printOdd(input);
		
	}//main
}


//이건 난이도 높은 편 아냐. 
