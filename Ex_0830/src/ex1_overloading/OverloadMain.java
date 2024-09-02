package ex1_overloading;

public class OverloadMain {
	public static void main(String[] args) {
		
		OverloadTest ot = new OverloadTest();
		ot.result();
		ot.result(10);
		ot.result('A');
		ot.resutl("hi", 10);
		ot.result(100, "hello")
		
		System.out.println();
	}
}
