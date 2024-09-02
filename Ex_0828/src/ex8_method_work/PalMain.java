package ex8_method_work;

import java.util.Scanner;

public class PalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");	
		String ori_str = sc.next();
	
		//키보드에서 입력받은 원본 문장을
		Palindrome pd = new Palindrome
		String rev = pd.rotate(ori_str);
		
		//입력받은 값이 회문인지 아닌지 판단
		if( ori_str.equals(rev)) {
			System.out.println(ori_str + "은 회문");
		}else {
			System.out.println(ori_str + "은 안회문");
		}
}

//return을 어디서 찍어야 하는지???


//키보드에서 입력받은 값이 회문(수)인지 판단하기
		//----------------
		//입력 : ab11ba
		//ab11ba 은(는) 회문 입니다
		
		//입력 : abc
		//abc 은(는) 회문이 아닙니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
	
		String ori_str = sc.next();//원본
		String rev_str = "";//원본을 뒤집어서 저장할 변수
		
		//ori-str을 뒤집어서 rev_str 저장
		for( int i = ori_str.length()-1; i >= 0; i--) {
			rev_str += ori_str.charAt(i);
		}
		
		if( ori_str.equals(rev_str)) {
			System.out.println(ori_str + "은(는) 회문임");
		}else {
			System.out.println(ori_str + "은(는) 회문이 아님");
		}
	}//main

