package ex1_file_reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex3_BufferedReader {

	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/test.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String msg = "";
		
		try {
			
			fr = new FileReader(f);
			br = new BuffereedReadr(fr);
			
			while( (msg = br.readLine()) != null) {
				System.out.println(msg);
			}//while
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (br !=null)
					br.close();
				if(fr != null)
					fr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}//main
}

// 다음 시간에 캐릭터 기반 스트림 보고, 그 다음 오브젝트 스트림 보고. 
마무리. 

