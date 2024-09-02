package ex1_single_array;

import java.util.Scanner;

public class Ex2_single_array {
	public static void main(String[] args) {
		
		//배열에 값을 입력해서 저장하고, 홀수와 짝수의 갯수를 찾아 출력
		//-------------------------------------
		//배열의 크기 : 5
		//정수 : 5
		//정수 : 3
		//정수 : 2
		//정수 : 11
		//정수 : 20
		//--------
		//홀수 : 3
		//짝수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
				
		int[] numbers = new int[size];
		int oddCnt = 0;//홀수 갯수를 저장할 변수
		int evenCnt = 0;//짝수 갯수를 저장할 변수
		
		//배열에 값 입력하기 
		for( int i = 0; i < size; i++ ) {
			System.out.print("정수 : ");
			numbers[i] = sc.nextInt();
			
		}//for
		
		//홀수와 짝수의 갯수 세기
		//numbers = {5, 6, 7, 8, 9}
		for ( int n : numbers ) {
			if ( n % 2 == 0) {
				evenCnt++;
			}else {
				oddCnt++;
			}
		}
			
		//		for( int i = 0; i < numbers.length; i++ ) {
//			if(numbers[i] % 2 == 0 )  {
//				//짝수
//				evenCnt++;
//			}else {
//				//홀수
//				oddCnt++;
//			}
//		}//for
		
		System.out.println("홀수 : " + oddCnt);
		System.out.println("짝수 : " + evenCnt);
	}//main
}

//if else 쓰는 건가. 뭐지?

//이 문제 연습. 반복 숙달. 