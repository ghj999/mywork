package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		c1.infomation();
		
		Computer c2 = new Computer();
		c2.ssd = 512;
		
		//private으로 지정된 brand변수는
		//Computer클래스 이외의 영역에서는 사용할 수 없다. 
		//c2.brand = "samsung";
		c2.infomation();
		
	}//main
}
