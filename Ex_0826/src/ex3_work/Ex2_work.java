package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값 크기의 홀수 마방진 만들기
		//------------
		//홀수 : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02
		
		//arr에 담아서 해볼 것. 배열에 담아서.
		
		Scanner sc = new Scanner(System.in);
		int num = 1;//시작 수 
		int y = 0;//행 관리 변수
		int x = 0;//열 관리 변수
		
		System.out.print("홀수 : ");
		int size = sc.nextInt(); 
		int [][] arr = new int[size][size];
		
		x = size / 2;
		
		while( num <= size*size) {
			arr[y][x]=num;
			
			if( num % size == 0 ) {
				y++;				
			}else {
				y--;
				x++;	
			}
				
			
			if( y < 0 ) {
				y = size - 1'
			}
			if( x >= size ) {
				x = 0;
			}
			
			num++; 
		}//while
		//arr배열에 규칙대로 값이 모두 채워졌으므로
		//배열의 모든 값을 순차적으로 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]);
			}//inner
			System.out.println();
		}//outer
		
	}//main
}
