package ex7_work;

public class ExWork {
	private String result = "";
	
	public void getResult( String input ) {
		
		for( int i = 0; i < input.length(); i++ ) {
			
			if( result.indexOf( input.charAt(i)) == -1 ) {
				result += input.charAt(i);
			}
		}//for
	
		System.out.println("결과 : " + result);
	}
}
