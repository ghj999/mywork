package ex7_generic;

public class GenTest<T> {
	
	//특정 메서드에만 제너릭 타입을 지정하는 것도 가능
	public void printArr(T[] arr) {
		for ( int i = 0; i < arr.length; i++ )  {
			System.out.print(arr[i] + " ");
		}//for
		
		System.out.println();
	}
	
}
