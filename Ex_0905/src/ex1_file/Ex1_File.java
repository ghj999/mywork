package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO(Input, Output)
		//IO는 입출력 스트림을 의미한다.
		//스트림이랑, 데이터를 입출력 하기위한 통로
		//JVM에서 콘솔의 값을 읽어오면 Input
		//JVM의 값을 콘솔로 가져오면 Output
		
		String path = "c:/IOtest/test.txt";
		File f = new File(path);
		
		if(!f.isDirectory()) {
			System.out.println(f.length() + "byte");
		}
		
		
	}//main
}
