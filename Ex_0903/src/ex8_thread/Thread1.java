package ex8_thread;

public class Thread1 extends Thread{

	@Override
	public void run() {
		for ( int i = 0; i < 100; i++ )
			System.out.println("1");
		
		// TODO Auto-generated method stub
		//super.run();
	}  //반드시 런 메서도, 오버라이딩까지 해야. 
	
	
}


