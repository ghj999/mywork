package ex11_thread;

public class ThreadCount extends Thread{

	private int num;
//	public ThreadCount(int num) {
//		this.num = num;
//	}
	//녹화본 참조. 9월 4일 아침 1교시 부분
	public void setNum(int num) {
		
	}
	
	@Override
	public void run() {
		
		for (int i = num; i >= 0; i-- ) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for
	
	}
	
}
