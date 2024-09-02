package ex8_work;

import java.util.Scanner;

public class ActorMain {
	public static void main(String[] args) {
		
		//배우검색 : lee
		//[lee]
		//광해
		//레드
		//지아이조
		
		//배우검색 : mmmm
		//해당 배우가 존재하지 않습니다. 
		
		String[][] actor = {{"[song]", "박쥐", "괴물", "관상"},
				{"[ma]", "범죄도시", "더파이브", "챔피언"},
				{"[lee]", "광해", "레드", "지아이조"}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배우검색 : ");
		String name = sc.next();
		
		ActorSearch as = new ActorSearch();
		as.searchRes(actor, name);
		
		
		
	}//main
}
