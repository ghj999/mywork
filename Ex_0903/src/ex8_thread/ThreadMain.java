package ex8_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		//인접한 위치에서 호출된 스레드들은
		//누가 먼저 실행될지 모른다. 아무도
		t1.start();
		
		Thread.sleep(1000);   //클래스 이름. 점 변수. 메서드. 이거 딱 한 상황인데. 뭐냐? 스 테 틱 메서드. ex) Bank.interet 처럼
		//이거 스테틱 메서드 호출하고 있는 거. 
		t2.start();
		
	}//main
}
