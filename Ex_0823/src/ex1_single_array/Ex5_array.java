package ex1_single_array;

public class Ex5_array {
	public static void main(String[] args) {
		//배열 arr에 담긴 값 중 가장 큰 값을 출력하고
		//arr의 값들을 오름차순 정렬
		//----------------------
		//가장 큰 값 : 19
		//1 4 7 13 15 19 
		int[] arr = {4, 13, 7, 19, 1, 15};
		
	
		int max = arr[0];
		
		for ( int i = 1; i < arr.length; i++ ) {
			
			if( arr[i] > max ) {
				max = arr[i];
			}
		}//for
		System.out.println("가장 큰 값: " + max);
	
		
		//배열 오름차순
		for ( int i = 0; i < arr.length; i ++ ) {
			for ( int j = i; j < arr.length; j ++ )
			
				if ( arr[j] > arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			
			}//inner
		}//outer
	
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.print( arr[i] + " ");
		}
	
	}//main
}




//가장 큰 값은 또 어케 찾지? 전역변수? 비교? if문? for문으로 돌리는 건가? 
// 정답 궁금. 정답은? 
//가장 큰 값을 어케 찾는지???

//이 부분 설명을 못 하겠네. 

//배열. 그대로 출력하는 건 어떻게 하는지?? 배열 그대로 출력하는 거. 

//지금이라도. 분석을 할 수 있어야. 