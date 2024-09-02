package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {
		
		pen p1 = new Pen();
		
		System.out.println(p1.company);
		System.out.println(p1.price);
		System.out.println(p1.color);
		
		System.out.println("----------------");
		
		Pen p2 = new Pen();
		//생성자는 new와 함께 사용된 이후, 재 호출이 불가
		//p2.Pen();
		
		p2.color = "red;"
		
		Pen p3 = new Pen("monami", 500 );
				
	}//main
}
