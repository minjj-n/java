package sub1;

/*
 * Date : 2019/04/14
 * Name : 김철학
 * Subject : 메서드 실습하기
 */
public class MethodTest {

	public static void main(String[] args) {
		
		// 메서드 실행(호출)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		
	}// main 메서드 끝
	
	// 메서드 정의
	public static int fx(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
}






