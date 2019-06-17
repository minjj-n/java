package sub1;

/*
 * 날짜 : 2019/04/21
 * 이름 : 김철학
 * 내용 : 오버로드 메서드 실습하기 교재 p230
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		overload();
		overload(1);
		overload("홍길동");
		overload(true);
		overload(false);
	}
	
	public static void overload() {
		System.out.println("첫번째 오버로드 메서드");
	}
	
	public static void overload(int num) {
		System.out.println("두번째 오버로드 메서드");
	}
	
	public static void overload(String name) {
		System.out.println("세번째 오버로드 메서드");
	}
	
	public static void overload(boolean isOk) {
		System.out.println("네번째 오버로드 메서드");
	}
	
}
