package ex2_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {
		
		//변수 money에 10 ~ 5000 사이의 난수를 발생시켜 넣는다. 
		//단, 1710, 3450과 같이 1의 자리 숫자는 반드시 0이어야 한다. 
		//coin배열을 사용하여 난수 money를 동전으로 바꿧을 때
		//가장 적은수의 동전을 사용하는 경우의 수 출력
		//------------------------
		//값 : 2590
		//500원 : 5
		//50원: 1
		//10원: 4
		int[] coin = {500, 100, 50, 10};
		
		int money = new Random().nextInt(500 - 1 + 1) + 1;
		money *= 10;
		
		System.out.println("값 : " + money);
		
		for ( int i = 0; i < coin.length; i++ ) {  //4바퀴 도는 거
			int res = money / coin[i];
			
			if( res > 0 ) {
				System.out.println(coin[i] + "원 : " + res );
				//money = money % coin[i];
				money %= coin[i];
			}
			
		}//for
		
	}//main
}// 이게 정답이고. 이 문제 다시 차분히. 잘 생각해보자. 
