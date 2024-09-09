package ex3_work;

import java.util.Scanner;

public class PlayGame {

	Scanner sc = new Scanner(System.in);
	char[] star;
	int PlayCount = 0;
	boolean check = false;
	
	//게임이 진행중임을 확인하는 변수
	
	boolean isPlaying = false;

	for (int i = 0; i < star.length;)
		
		
		
		label : while(true) {
			
			playCount++;
			
			System.out.print("word : ");
			for(int i = 0; i < star.length; i++ )
				System.out.print(star[i]);
			System.out.print(">> ");
			
			//키보드에서 값을 입력받는다
			String in = sc.next();
			char ch = in.charAt(0);
			
			if(ch < 'a' || ch > 'z' || in.length() > 1 ) {
				System.out.println("한글자의 영 소문자만 입력하세요");
				continue label;
			}
			
			check = false;
			isPlaying = false;
			
		}//while
	
	//일치하는 단어 확인
	if( ch == word.charAt(i)) {
		star[i] = ch;
		check = true;
	}
	
	if( !check ) {
		System.out.println(ch + "이(가) 포함되어 있지 않습니다");
	}
	
	//게임종료 판별
	if (!isPlaying ) {
		System.out.println(word + "정답!! ");
		System.out.println(playCount + "회 만에 정답");
	}
	
	return playCount;

} //play
