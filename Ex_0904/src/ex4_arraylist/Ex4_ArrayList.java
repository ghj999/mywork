package ex4_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_ArrayList {
	public static void main(String[] args) {
		
		//id : aaa
		//[aaa]
		//id : bbb
		//[aaa, bbb]
		// id : 
		
		/*Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		while(true) {
			System.out.println("id : ");
			String id = sc.next();
			
			list.add(id);
			
			System.out.println(list);
		}
		*/
		//id : aaa
		//[aaa]
		//id : bbb
		//[aaa, bbb]
		// id : aaa
		//중복된 id
		//id: ccc
		//[aaa, bbb, ccc]
		//id : 
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		w : while(true) {
			System.out.println("id : ");
			String id = sc.next();
		
			if(list.contains((id)){
				System.out.println("중복된 id");
				continue;
			}
			
	/*		for(int i = 0; i < list.size(); i++)  {
				if(list.get(i) equals(id)) {
					System.out.println("중복된 id");
					continue w;
				}
		*/	}
			list.add(id);
			
			System.out.println(list);
		
		if( = ) {
			
		}else(  ) {
			
		}
			
			
	}//main
}

//2번째 문제. 
//모르겠는데?
