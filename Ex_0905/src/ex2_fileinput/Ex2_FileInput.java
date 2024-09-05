package ex2_fileinput;

import java.io.FileInputStream;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[100];
		
		if(f.exists()) {
			fis = new FileInputStream(f);
		}		
		
		try {
			if (fis != null){
				fis.close();
			}
		}	catch (Exception e2) {
			
		}
		
	}//main
}
