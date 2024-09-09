package ex1_file_reader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//test.txt의 내용을 읽어서
		//알파벳 대문자의 갯수와, 소문자의 갯수를 출력
		// --------------------------------
		//대문자 : 3
		//소문자 : 8
		
		
		File f = new File("c:/IOtest/test.txt");
		FileReader fr = null;
		
		int upper = 0;//대문자 갯수
		int lower = 0;//소문자 갯수
		
		try {
			
			fr = new FileReader(f);
			int code = 0;
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;
				}
				if( code >= 'a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (fr != null)
					fr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}//main
}



// 뭐지? 이 문제는? 나는 하나도 모르겠는데???
// 정답 궁금. 정답 궁금.