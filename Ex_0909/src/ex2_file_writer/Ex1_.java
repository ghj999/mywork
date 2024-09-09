package ex2_file_writer;

public class Ex1_ {

	
	try {
		
		fw = new FileWriter(f);
		String str = "나는 fileWriter의 예제입니다."
		fw.write(str)
	} catch( Exception e ) {
		//
	} finally {
		try {
			if(fw != null)
				fw.close();
		}catch (Exception e) {
			
		}
	}
	
}
