package ex12_work;

public class ThreadTimer extends Thread{

	private int timer = 0;
	private boolean fin = true;
	
	set //세터
	
	@Override
	public void run() {
		
		while(fin) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			timer++;
			
		}//while
		
		System.out.println("결과 : " + timer + "초");
		
	}
}
