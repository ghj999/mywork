package ex2_overloading;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		//1) makeBread()
		//빵을 만들었습니다.
		bread.makeBread();
		
		//2) makeBread()
		//빵을 만들었습니다. 
		//빵을 만들었습니다. 
		//2개의 빵을 만들었습니다. 
		bread.makeBread(2);
		
		//3) makeBread(String, int)
		//크림빵을 만들었습니다.
		//크림빵을 만들었습니다.
		//2개의 크림빵을 만들었습니다.
		bread.makeBread("크림빵", 2);
		
	}//main
}
