package ex5_class_array;


public class Vending {

	private Can[] cans = new Can[5];
	private int money;
	
	//음료수의 종류와 가격을 초기화
	public void init() {
		for( int i = 0; i < cans.length; i++ ) {
			cans[i] = new Can();
		}
		
		cans[0].setName("fanta");
		cans[0].setPrice(1000);
		
		cans[1].setName("cider");
		cans[1].setPrice(1200);
				
		cans[2].setName("orange");
		cans[2].setPrice(800);
						
		cans[3].setName("banana");
		cans[3].setPrice(1100);
		
		cans[4].setName("coke");
		cans[4].setPrice(1100);
		
	}//init()
	
	//들어온 금액으로 마실 수 있는 음료의 목록 출력
	public void showCans( int m  ) {
		money = m;
		for ( int i = 0; i < cans.length; i++ ) {
			
			if(cans[i].getPrice() <= money) {
				System.out.printf("%s - %d\n", cans[i].getName(), cans[i].getPrice());
			}
		}//for
	}
	//음료를 선택하고 잔액을 계산하는 메서드
	public void selectCan(String name) {
		
		for(int i = 0; i < cans.length; i++ ) {
			
			if(cans[i].getName().equalsIgnoreCase(name)) {
				
				System.out.println(name + "을 선택함");
				System.out.println(money - cans[i].getPrice() + "원" );
			}
		}//for
		
	}
	


}
