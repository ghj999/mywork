package ex2_work;
import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {
		
		//1 ~ 45사이의 중복되지 않는 난수들을 저장하는 lotto 배열을 만들고 값을 출력
		//------------------------
		// 11 7 42 13 9 20 
		int[] lotto = new int[6];
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			lotto[i] = new Random().nextInt(45) + 1;
			
			//중복값 비교
			for( int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
				
			}//inner
			
			System.out.print(lotto[i] + " ");
			i++;    //여기다가 증감식을 넣을 것. 
		}//outer
		
	}//main
}



