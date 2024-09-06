package ex1_byte_stream;

import java.util.Scanner;

public class Ex3_BufferedInputl {
	public static void main(String[] args) {
		
		//입력 : a
		//a의 갯수 : 2
		
		//입력 : 홍
		//홍의 갯수 : 2
			
		Scanner sc = new Scanner(System.in);
		String path = "C:/IOtest/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()]
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		String content = "";
		
		try {
			
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			bis.read(b_read);
			
			content = new String(b_read);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				if (bis != null)
					bis.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}//finally
		
		System.out.print("입력 : ");
		String input = sc.next();
		int count = 0;
		
		//String s = "" + content.charAt(0);
		char s = input.charAt(0);
		
		for ( int i = 0; i < content.length(); i++ ) {
			if(s == content.charAt(i)) {
				count++;
			}
		}
		
		System.out.printf("%s의 갯수 : %d개\n", input, count);
			
		
	}//main
}
// 이걸 어케 하지? 
// 이 문제는 어케 풀지???
// 이 문제. 요 문제 마스터할 것. 
