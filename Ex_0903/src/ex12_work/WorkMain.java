package ex12_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		
		//1 ~ 100 사이의 난수 두개를 더하는 문제를 출제
		//답을 입력하여 5문제가 정답처리 될 때 까지 코드를 반복
		//게임이 끝날 때 5문제를 모두 맞히는데 몇초가 걸렸는지를 출력
		//----------------------- 오로지 스레드로
		//23 + 48 = 71
		//정답
		//100 + 66 = 10
		//오답
		//61 + 51 = 112
		//정답
		//결과 : 24초
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int playCount = 0;
		final int FINISH = 5;
		
		ThreadTimer tt = new ThreadTimer();
		tt.start();
		
		while( true ) {
		
			int su1 = rnd.nextInt(100) + 1;
			int su2 = rnd.nextInt(100) + 1;
			
			System.out.printf("%d + %d = ", su1, su2);
			
			int res = sc.nextInt();
			
			if(res == (su1 + su2)) {
				System.out.println("정답");
				playCount++
			}else {
				System.out.println("오답");
			}
			
			//게임종료 처리
			if (playCount == 5) {
				tt.setFin
				break;
			}
			
			
		}//while
				
	}//main
}


//문제가 어려워서 굉장히 화가 나네. 
// 내가 할 수 있을가? 어??

//이 문제 다시 반복. 마스터. 
