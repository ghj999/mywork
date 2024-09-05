package ex2_fileinput;

import java.io.FileInputStream;

public class Ex3_FileInput {
	public static void main(String[] args) {
	
		String path = C:\java_jgh\work\Ex_0903\src\ex12_work
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int)f.length()];
		
		if(f.exists()) {
		}		
		
		try {
			fis = new FileInputStream(f);
			fis.read(b_read)
			
			if (fis != null){
				fis.close();
			}
		}	catch (Exception e2) {
			
		}
		
	}//main
	
	
}
