package ex9_work;

import java.util.Scanner;

public class NumBaseBall {
	public static void main(String[] args) {
		
		//1 ~ 9 사이의 난수 세개를 중복되지 않도록 생성하고
		//키보드에서 입력받은 값으로 strike, ball, out을 판단
		//
	
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터가 발생시킬 세 개의 난수
		int[] com = new int[3];
		
		do {
			
			//1 ~ 9사이의 난수를 발생
			for(int i = 0; i < com.length; i++ ) {
				com[i] = new Random().nextInt(9) + 1;
				
			}//for
		}while( com[0] == com[1] || com[0] == com[2] ||com[1] == com[2] );
		System.out.println("" + com[0] + com[1] + com[2]);
		
		while(true) {
			System.out.print("입력 : ");
			int number = sc.nextInt(); //123
			
			//사용자의 입력값을 백, 십, 일의 자리로 나눠서 user배열에 저장
			int[] user = { number/100, number/10%10, number%10};
			
			int strike = 0;
			int ball = 0;
			
			//경우의 수
			for (int i = 0; i < com.length; i++ ) {
				for (int j = 0; j < com.length; j++ ) {
					if ( i ==j ) {
						if ( com[i] == user[j] ) {
							strike++;
						}
					}else {
						if(com[i] == user[j]) {
							ball++;
						}
					}
					
				}//inner
			}//outer
			//정답
			if (strike == com.length ) {
				System.out.println("정답! - " + com[0] + com[1] + com[2]);
				break;//while 종료
			} else {
				if( strike > 0 || ball > 0 ) {
					System.out.println(strike + "Strike, " + ball + "Ball");
				}else {
					System.out.println("OUT!!");
				}		
			}
			System.out.println("-----------------");
		} //무한반복하는 와일문으로 포장. //while
	
		
	}//main
}
