package ex1_string;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		
		//주민번호 : 901122-1234567
		//당신은 90년 11월 22일에 태어난 남자입니다

		
		Scanner sc = new Scanner(System.in);  //스캐너도 명시적 객체 생성
		System.out.print("주민번호 : ");
		String id = sc.next();
		
		String year = id.substring(0, 2);//년
		String month = id.substring(2, 4);//월
		String day = id.substring(4, 6);//일

		String s_gender = id.substring(7, 8);
		int gen = Integer.parseInt(s_gender);
		
		if (gen % 2 == 0) {
			s_gender = "여자";
		}else {
			s_gender = "남자";
		}
		System.out.printf("당신은 %s년 %s월 %s일에 태어난 %s 입니다", year, month, day, s_gender);
	}//main
}

//이걸 어케 하지?
//이걸 어케?
