package ex9_work;

import java.util.Scanner;

public class Ex1_Work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값을 암호화 한 결과를 출력
		//----------------------------
		//입력 : abc123
		//결과 : `~!wer
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String src = sc.next();
		
		WorkExam we = new WorkExam();
		we.changeWord(src);
		
		
	}//main
}
