package ex2_fileinput;

public class Ex5_FileInput {
	public static void main(String[] args) {
		
		//test.txt의 내용을 읽어서
		//회문인지 아닌지를 판단
		//-------------------------
		//abc은(는) 회문이 아닙니다
		
		String path = "C:\IOtest\test.txt"
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		String ori = "";//원본
		String rev = "";//원본을 뒤집어서 저장할 변수

		if( f.exists()) {
			try {
				
				fis = new FileInputStream(f);
				
				//fis가 읽어온 내용을 b_read배열에 1byte씩 담는다
				fis.read( b_read );
				
				//byte배열을 String타입으로 변환
				ori.new String(b_read);
				
				//원본을 뒤집어서 저장
				for(int i = ori.length()-1; i >= 0; i-- ) {
					rev += ori.charAt(i);
				}//for
				
				//결과확인
				if (ori.equals(rev)) {
					System.out.println(ori + "은(는) 회문 입니다");
				}else {
					System.out.println(ori + "은(는) 회문이 아닙니다");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				if( fis != null )  {
					try {
						fis.close();
					}catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
		
	}//main	
}

//회문 3번째 문제
//이제 슬슬 할 때가 되지 않았나. 
