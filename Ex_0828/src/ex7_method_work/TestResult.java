package ex7_method_work;

public class TestResult {
	
	int cnt = 0;
	int cnt = 0;
	
	public void printRes(String q) {
		//q =
		//연산 및 최종결과
		
		for ( int i = 0; i < q.length(); i++ ) {
			
			if(q.charAt(i) == 0 ) {
				cnt++;
			}else {
				cnt = 0;
			}
						
			sum += cnt;
		}//for
		System.out.println("결과 :");
		
	}
}
