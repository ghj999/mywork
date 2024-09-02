package ex8_work;

public class ActorSearch {
	
	private int cnt = 0;
	
	public void searchRes( String[][] actor, String name ) {
		
		for(int i = 0; i < actor.length; i++ ) {
			if(actor[i][0].equals("[" + name + "]") ) {
				
				for(int j = 0; j < actor[i].length; j++ ) {
					System.out.println(actor[i][j]);
				}//inner
			}else {
				cnt++;
				if( cnt >= actor.length ) {
					System.out.println("해당 배우의 정보가 없습니다");
				}
			}
		}//outer
		
	}
	
}
