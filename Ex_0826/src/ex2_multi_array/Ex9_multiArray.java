package ex2_multi_array;

import java.util.Scanner;

public class Ex9_multiArray {
	private static final string[][][] String = null;

	public static void main(String[] args) {
		
		//학생들의 수학, 영어성적을 등록하는 프로그램이 있다. 
		//몇 명의 정보를 저장할 것인지를 입력 받고
		//그 수 만큼 학생들의 이름과 수학, 영어성적을 추가하자. 
		//--------------------
		//등록인원 : 2
		//이름 : hong
		//수학 : 90
		//영어 : 87
		//-----------
		//이름 : kim
		//수학 : 70
		//영어 : 100
		//--------------------
		//2명 등록 성공
		//hong 90 87
		//kim 70 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("등록인원 : ");
		int n = sc.nextInt();
		
		String[] subject = {"이름", "수학", "영어"};
		
		String[][] stu = new String[n][subject.length];
		
		for( int i = 0; i < stu.length; i++ ) {
			for (int j = 0; j < stu[i].length; j++ ) {
				System.out.print(subject[j] + " : ");
				stu[i][j] = sc.next();
			}
		}
				
		for( int i = 0; i < stu.length; i++) {
			
			System.out.print("이름 : ");
			stu[i][0] = sc.next();
			
			System.out.print("수학 : ");
			stu[i][1] = sc.next();
			
			System.out.print("영어 : ");
			stu[i][2] = sc.next();
			
			System.out.println("-----------------------");
		}
		System.out.println(n + "명 등록 완료");
		for (int i = 0; i < stu.length; i++) {
			for ( int j = 0; j < stu[i].length; j++) {
				System.out.print(stu[i][j] + "\t");
			}
		}
	}//main
}

//String[][]a = {{"hong", "90","87"}, {"kim", "70", "100"}}
	//배열 만들어서. 내가 입력받은 거 넣어놓고. 나중에 출력
