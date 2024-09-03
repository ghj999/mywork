package ex9_Thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		
		while(true) {
			System.out.println(++n + "스레드");
		
			Thread.sleep(1000);
		}
	}

	
}
