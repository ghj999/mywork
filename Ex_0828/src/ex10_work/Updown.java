package ex10_work;

import java.util.Random;

public class Updown {
	
	int random = new Random().nextInt(50) + 1;
	int count = 0;
	
	public boolean check( int n ){
		//키보드에서 받은 값이 up인지, down인지, 정답인지 판단
		count++;
		
		if( n < random ) {
			System.out.println("UP");
		}else if ( n > random ) {
			System.out.println("DOWN");
		}else {
			System.out.println(count + "회 만에 정답");
			return true;
		}
		
		return false;
	}
}
