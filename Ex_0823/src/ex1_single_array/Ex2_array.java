package ex1_single_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!';
		
		//JAVA    //옆으로 출력해보기
		for( int i = 0; i < ch.length; i++ ) {
			System.out.print( ch[i]);
		}
					
	}//main
}
