package ex3_work;

import java.util.List;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		//ArrayList를 활용하여 
		//고객의 인적사항을 추가, 삭제, 조회하는 코드를 작성
		//------------------------
		//1.정보추가
		//2.정보삭제
		//3.전체정보
		//etc.종 료
		//>> 1
		//이름 : hong
		//나이 : 20
		//전화 : 010-111-2222
		//정보 저장 성공
		
		Scanner sc = new Scanner(System.in);
		List<Person> personArr = new ArrayList<Person>();
		
		while(true) {
			
			System.out.println("1.정보추가");
			System.out.println("2.정보삭제");
			System.out.println("3.전체정보");
			System.out.println("etc.종  료");
			System.out.println(">> ");
			
			switch( sc.nextInt() ) {
			case 1: //정보추가
				Person p = new Person();
				System.out.print("이름 : ");
				p.setName(sc.netx());
				
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				
				System.out.print("전화 : ");
				p.setTel( sc.next() );
				
				
				//값을 채운 Person객체를 ArrayList에 담는다
				personArr.add(p);
				System.out.println("정보 저장 성공");
				break;
			case 2: //정보삭제
				System.out.print("삭제할 이름 : ");
				String name = sc.next();
				
				for( int i = 0; i < personArr.size(); i++ ) {
					
					if(personArr.get(i).getName().equals(name)) {
						personArr.remove(i);
						System.out.println(name + "을 삭제함");
						break;
					}
				}
				
				break;
			case 3: //전체정보
				System.out.println("등록인원 : 총 " + personArr.size() + "명");
				
				for(int i = 0; i < personArr.size(); i++ ) {
					System.out.print("%s / %d / %s\n", personArr.get(i).getName(), personArr.get(i).getAge(), personArr.get(i).getTel());
				}//for
				break;
				
			default:
				System.out.println("종료");
				break;
			}//switch
			
			
			
		}//while
				
	}//main
}
