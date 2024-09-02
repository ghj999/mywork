package ex2_multi_array;

public class Ex5_multiArray {
	public static void main(String[] args) {
		
		//2차원 배열 arr에 담긴 모든 값의 총 합과 평균을 출력
		//-------------------
		//총 합 : 150
		//평균 : 12.5
		
		int[][] arr = { {5, 17, 2, 1},
				{11, 6},
				{9, 15, 20},
				{13, 21, 30}};
		
		int total = 0; //총 합을 구하기 위한 변수
		float avg = 0; //평균을 담기위한 변수
		int cnt = 0; //평균을 구하기 위해 나눠야 하는 값
		
		for ( int i = 0 ; i < arr.length; i++ )  {
			for ( int j = 0; j < arr[i].length ; j++ ) {
				total += arr[i][j];
				cnt++;
				
			}//inner
		}//outer
		System.out.println("총 합 : " + total);
		avg = (float)total / cnt;
		System.out.printf("%.1f", avg);
	
	}//main
	
}



//간단하지 않을 수 있지만. 이해는 해야되는 문제. 
// 이 문제도 나중에 해답 보고. 마스터 할 것. 
//이걸 어케 하라는 건지???

// 다 더해야 하니까. 전역변수 하나 필요. 

// 지금 시간에 못 했으면, 최대한 빠른 시간 안에 내 스스로 할 수 있는 단계가 되야. 