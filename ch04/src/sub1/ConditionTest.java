package sub1;

/*
 * 날짜 : 2019/04/07
 * 이름 : 김철학
 * 내용 : 조건문 실습하기 교재 p108
 */
public class ConditionTest {
	
	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			// if문이 참일때 실행
			System.out.println("num1이 num2보다 크다.");			
		}
		
		
		if(num1 > 0) {
			if(num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다.");
		}
		
		// if ~ else
		int val1 = 1;
		int val2 = 2;		
		
		if( val1 > val2 ) {
			// 조건이 참일 경우 실행
			System.out.println("val1이 val2보다 크다.");
		}else {
			// 조건이 거짓일 경우 실행			
			System.out.println("val1이 val2보다 작다.");
		}
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n2 > n3) {
			System.out.println("n2이 n3보다 크다.");
		}else if(n3 > n4) {
			System.out.println("n3이 n4보다 크다.");
		}else {
			System.out.println("n4가 가장 크다.");
		}
		
		// switch
		String fruit = "mango";
		
		switch(fruit) {
		
			case "apple":
				System.out.println("과일은 사과입니다.");
				break;
				
			case "grape":
				System.out.println("과일은 포도입니다.");
				break;
				
			case "orange":
				System.out.println("과일은 오렌지입니다.");
				break;
				
			default:
				System.out.println("해당하는 과일이 없습니다.");
				break;
		}
		
		System.out.println("프로그램 종료...");
	}	
}
