package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) 
		
		//....Stream : 무조건 1byte. 바이트 기반의 스트림
		//... Reader, ...Writer : 캐릭터 기반의 스트림 (2byte)
		
		String path = "C:/IOtest/test.txt";
		File f = new File(path);
		
		if (f.exists() ) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				int code = 0;
				
				//접근한 path경로에서 더이상 읽을게 없을 때까지(EOF : -1)
				//반복문을 수행한다
				while((code = fis.read()) != -1 ) {
					
					char ch = (char)code;
					System.out.print(ch);
					
				}//while
						
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					//사용을 완료한 스트림은 반드시 줘야 한다.
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			
			
		}
		
	}//main
}
