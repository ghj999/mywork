package ex4_constructor;

public class Pen {

	String company = "monami";
	int price = 500;
	String color = "black";
	
	
	
	public Pen( String color ) {
		this.color = color;
	}
	public Pen( String com, int price, String color ) {
		company = com;
		this.price = price;
		this.color = color;
		
	}


	public String getCompany() {
		return company;
	}



	public int getPrice() {
		return price;
	}



	public String getColor() {
		return color;
	}
	
}
