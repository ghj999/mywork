package ex11_thread;

import ex9_Thread.MyThread;

public class ThreadMain {
	public static void main(String[] args) {
		//키보드에서 입력받은 숫자가 1씩 감소하다가(1초간격)
		//0이 되었을 때 스레드를 종료하는 코드를 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		ThreadCount t = new ThreadCount();
		t.setNum(num);
		
		t.start();
		
		
	}//main
}

// 정답 궁금??

//메인에서 받는 값을. 상속받는 스레드에게 어덯게 보낼 것이냐 하는 거. 그거 때문에 하는 문제. 

