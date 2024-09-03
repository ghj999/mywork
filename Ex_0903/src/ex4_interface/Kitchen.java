package ex4_interface;

//인터페이스는 스스로 실행할 능력이 없으므로, 다중구현이 가능하다
//public class Kitchen implements Menu1, Menu2, Menu3{
	
	public class Kitchen implements Menu2{
		
	}

	@Override
	public String jjajang() {
		return "춘장, 중면";
	}
	
	@Override
	public String jjambbong() {
		return "각종해산물";
	}
	
	@Override
	public String tangsuyuck() {
		return "돼지고기";
	}

	@Override
	public String boggembab() {
		return "각종채소";
	}
}
