package ex2_overloading;

public class Bread {

	//1) 인자가 없는 메서드
	public void makeBread() {
		System.out.println("빵을 만들었습니다");
	}
	
	//2) 빵의 갯수를 인자로 받는 메서드
	public void makeBread( int n ) {
		for (int i = 0; i < n; i++ )
		System.out.println("빵을 만들었습니다");
		}
		
	
	//3) 빵의 이름, 갯수를 인자로 받는 메서드
	public void makeBread(String name, int n) {
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%s를 만들었습니다\n", name);
		}
		System.out.println(n + "개의 " + name + "을 만들었습니다");
		
	}
}
