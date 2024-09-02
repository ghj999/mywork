package ex9_work;

public class WorkExam {
	char[] alphaCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};
	char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
	String result = "";
	
	public void changeWord( String src ) {
	
		for ( int i = 0 ; i < src.length(); i++ ) {
			char ch = src.charAt(i);
			if( ch >= 'a' && ch <= 'z') {
				result += alphaCode[ch-'a'];
			}else if( ch >= '0' && ch <= '9' ) {
				result += numCode[ch - '0'];
			}
		}//for
		System.out.println("result : " + result);
	}
}
