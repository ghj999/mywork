package ex2_set_get;

public class SgMain {
	public static void main(String[] args) {
		
		SGexam person1 = new SGexam();
		person1.setCompany("LG");
		person1.setName("홍길동");
		person1.setAge(20);
		
		String ss = person1.getCompany();
		System.out.println(person1.ss);
		System.out.println(person1.getName(10));
		System.out.println(person1.getAge());
		
	}//main
}

//setter와 getter 왜 쓰는지는 몰라도. 보안성이랑 은닉성 때문이기는 한데. 
// 어떻게 쓰는지는 무조건 알아야 한다. 
