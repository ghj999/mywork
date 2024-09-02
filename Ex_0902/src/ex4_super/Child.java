package ex4_super;

public class Child extends Parent{

	//super : 부모클래스
	//super(); <-- 부모생성자
	//super.method(); <-- 부모의 메서드
	//super.naver <-- 부모의 변수
	
	public Child() {
		super(10); //부모클래스의 생성자
		System.out.println("Child의 생성자");
	}
	
	@Override
	public int getValue() {
		//부모의 getValue()fmf ghcnf
			//Parent.getValue();
		//return super.getValue();
		return 100;
	}
	
	int value;
	public void setValue(int value) {
		//Parent가 가진 value변수에 값을 대입
		super.value = value;
	}
	
}
