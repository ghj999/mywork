package ex5_work;

import java.util.List;

public class WordGame extends Thread{

	private List<String> arr;
	private String[] data;
	
	public WordGame( List<String> arr, String[] data ) {
		this.arr = arr;
		this.data = data;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			//3초 간격으로 배열 data의 값 중 하나를 임의로 선택
			int rand = new Random().nextInt(data.length);
			
			//arr에 임의로 선택된 단어를 추가
			arr.add(data[rand]);

			Thread.sleep(3000);  //try catch로 묶어
		}
		
	}
	
}
