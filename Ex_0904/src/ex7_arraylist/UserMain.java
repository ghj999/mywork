package ex7_arraylist;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		//id : aaa
		//pw : 1111
		//aaa/1111
		// -----------------
		//id : bbb
		//pw : 2222
		//aaa / 1111
		//bbb / 2222
		//--------------------
		//id : aaa
		//pw : 3333
		//중복된 아이디
		//id : 
		
		
		Scanner sc = new Scanner(System.in);
		List<User> arr = new ArrayList<User>();
		
		User u = new User();
		
		while(true) {
			System.out.print("id : ");
			String id = sc.next();
			
			System.out.print("pw : ");
			int pw = sc.nextInt();
			
			//id 중복 체크
			for (int i = 0; i < arr.size(); i++ )
				if(arr.get(i).getId()) {
					
				}
		}//for
			
			u.setId(id);
			u.setPw(pw);
			
			arr.add(u);
			
			//arr에 담긴 모든 user 정보 확인
			for (int i = 0; i < arr.size(); i++) {

				System.out.printf("%s / $d\n");
				System.out.println("----------------");
			}
			
		}//while
		
		
		
		
	}//main
}
//요 구조는 백프로 다 이해를 하고 있어야.

//arrayList 이 부분은 다시 해야깟

//중복체크 하고. 추가할지 말지를 결정하는게 맞다. 


