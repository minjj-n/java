package sub1;

/*
 * 날짜 : 2019/04/21
 * 이름 : 김철학
 * 내용 : 메서드 영역 실습하기
 */
public class MethodScopeTest {
	// 전역변수
	int num1 = 1;
	int num2 = 2;
	
	public static void main(String[] args) {
		// 지역변수
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		
		System.out.println("결과 : "+result);
	}
	
	public static int sum(int s, int e) {
		// 지역변수
		int sum = 0;
		
		for(int k=s ; k<=e ; k++) {
			sum += k;
		}
		return sum;
	}	
}






