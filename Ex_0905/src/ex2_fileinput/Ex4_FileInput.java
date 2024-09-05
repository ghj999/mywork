package ex2_fileinput;

import java.io.FileInputStream;

public class Ex4_FileInput {
	public static void main(String[] args) {
		
		//test.txt의 내용을 읽어 숫자들의 합만 출력
		//--------------------
		//결과 : 11 (결과만 한줄 뿌려주면 되요)
		
		String path = "C:\IOtest"
		File f = new File(path);
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(f())
			
			int code = 0;
			int sum = 0;
			
			while( (code = fis.read()) != -1 ) {
				
				String s = "" + (char)code;
				
				try {
					sum += Integer.parseInt(s);
				}catch (Exception e) {
					
				}
				
			}//while
					
					
		}catch (Exception e) {
			
		}
	
	}//main
}




// 이건 좀 했으면 좋겠는데. 
//이 문제는 와일문으로 도는게 훨씬 코드가 줄어듭니다. - 힌트
