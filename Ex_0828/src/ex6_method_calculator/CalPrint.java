package ex6_method_calculator;

public class CalPrint {

	public void printResult(int su1, int su2, String op){
		//결과 출력
	
		switch( op ) {
		case "+":
			System.out.printf("%d + %d = %d", su1, su2, su1 + su2 );		
			break;
						
		case "-":
			System.out.printf("%d - %d = %d", su1, su2, su1 - su2 );
			break;
						
		case "*":
			System.out.printf("%d * %d = %d", su1, su2, su1 * su2 );
			break;
						
		case "/":
			System.out.printf("%d / %d = %d", su1, su2, su1 / su2 );		
		break;
						
		default:
			result = "올바른 연산자가 아님";
			break;
		}//switch
					
		System.out.println(result);
		
	}
}
