package ex9_work;

import java.util.Random;

public class WorkMain {
	public static void main(String[] args) {
		
		//0 ~ 9 사이의 난수를 100개 발생시킨다
		//100개의 수를 분석하여 0의 갯수부터 9의 갯수까지를 그래프화 하시오
		//--------------------
		//709121............
		//0의 갯수 : ##### 5
		//1의 갯수 : ####### 7
		//............
		//9의 갯수 : ### 3
	
		int[] nArr = new int[10];
		
		for( int i = 0; i < 100 ; i++ ) {
			int rnd = new Random().nextInt(10);
			System.out.print(rnd);
			nArr[rnd]++;
		}//for
		
		System.out.println();
		
		Graph gp = new Graph();
		gp.printGraph(nArr);
		
	}//main
}
