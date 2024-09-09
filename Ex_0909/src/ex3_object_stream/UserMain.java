package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
	
		User user = new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.새로 등록");
		System.out.println("2.불러 오기");
		System.out.println(">> ");
		int select = sc.nextInt();
		
		switch( select ) {
		
		case 1:
			System.out.print("이름 : ");
			user.setName( sc.next() );
			
			System.out.print("나이 : ");
			user.setAge( sc.nextInt());
			
			System.out.print("전화 : ");
			user.setTel( sc.next() );
			
			//유저 정보 저장을 위한 클래스
			InfoWriter iw = new InfoWriter();
			iw.writeInfo(user);
				String path = "c:/IOtest/User/" + user.getTel().trim() + "/save.sav";
				File dir1 = new File("c:/IOtest/User");
				
				if( !dir1.exists())
					dir1.mkdirs();
				
				File dir2 = new File(dir1, user.getTel().trim());
				
				if( !dir2.exists() )
					dir2.mkdirs();
				
				FileOutputStream fos = null;
				ObjectOutputStream oos = null;
				
				try {
					fos = new FileOutputStream(path);
					oos = new ObjectOutputStream(fos);
					
					//User객체를 통째로 기록한다
					oos.writeObject(user);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("기록 저장 실패");
					
				} finally {
					try {
						if ( oos != null )
							oos.close();
						if ( fos != null )
							fos.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			break;
		
		case 2:
			System.out.print("전화 : ");
			InfoLoader il = new InfoLoader();
			user = il.loadInfo( sc.next() );
			
			if(user != null ) {
				System.out.println("이름 : " + user.getName());
				System.out.println("나이 : " + user.getAge());
				System.out.println("전화 : " + user.getTel());
			}
						
			break;
		
		}//switch
		
	}//main
	
}

//이게 object와 관련된 스트림.
