package ex8_method_work;

public class Palindrome {
	
	String rev_str = " ";
	public String rotate(String_ori) {
		//원본 문자열을 뒤집어서 저장
		return "";
	
		for( int i = ori_str.length()-1; i >= 0; i--) {
			rev_str += ori_str.charAt(i);
		}
		if( ori_str.equals(rev_str)) {
			System.out.println(ori_str + "은(는) 회문임");
		}else {
			System.out.println(ori_str + "은(는) 회문이 아님");
		}
		
	
	}
}

//return이 반드시 필요