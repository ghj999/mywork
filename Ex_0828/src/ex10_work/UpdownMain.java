package ex10_work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		//UP&Down게임 만들기
		//-------------
		//값 : 30
		//DOWN!!
		//값 : 15
		//UP!!
		//값 : 25
		//3회만에 정답
	
		
		Scanner sc = new Scanner(System.in);
		
		Updown ud = new Updown();
		
		while(true) {
			System.out.println("값 :");
			int num = sc.nextInt();
			
			boolean res = ud.check(num);
			
			//정답을 맞히면 현재 while문을 빠져나온다
			if ( res == true ) {//res == true
				break;
			}
			
			//res == false
			//if( !res ) {}
		}
	}
}
