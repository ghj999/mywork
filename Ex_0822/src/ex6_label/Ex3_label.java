package ex6_label;

public class Ex3_label {
	public static void main(String[] args) {
		
		out:while( true ) {
			
			int n = new Random().nextInt(2) + 1;
			
			switch(n) {
			
			case 1:
				System.out.println("hi");
				break;
				
			case 2:
				System.out.println("bye");
				break out;
			}
			
		}//while
		
	}//main
}
