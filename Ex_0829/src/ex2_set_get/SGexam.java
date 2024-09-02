package ex2_set_get;

public class SGexam {

	private String company = "금성";
	private	String name;
	private int age;
	
	public void setAge( int a ) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCompany(String com) {
		company = com;
	}
	
	public String getCompany() {
		return company;
	}
	
}
