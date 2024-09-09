package ex2_file_writer;

public class Ex2_BufferedWritter {
	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/bufferedWritter예제.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(bw);
			
			bw.write("bufferedWriter의 예제에요");
			bw.newLine();//줄바꿈 코드
		}
		
	}
}
