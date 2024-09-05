package ex5_work;

import java.util.List;
import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<String>();
		String[] data = {"apple", "banana", "oragne", "grape"};
		
		WordGame wg = new WordGame(arr, data);
		
		
		wg.start();
		
		//Thread.sleep(100);
		
		Scanner sc = new.Scanner(System.in);
		
		while(true) {
			//게임종료
			if (arr.size() == 0) {
				System.out.println("클리어");
				break;
			}
			
			System.out.println(arr);   //이게 뭐야
		
			
			//정답처리
			for (int i = 0; i < arr.size(); i++ )
				if ( in.equals(arr.get(i))) {
					arr.romove
				}
		}//while
		
	}//main
}
