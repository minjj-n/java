package sub2;
/*
 * 2019/06/17
 * 김민정
 * String 클래스 실습 교재 p496
 */
public class StringTest {

	public static void main(String[] args) {
		
		//문자열 = 문자 + 배열
		String str = "Hello";
		
		
		//문자 + 배열
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		
		//문자열 생성
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "Hello";
		
		if(str1 == str2) {
			System.out.println("str1과 str2 참조값이 같다.");
		}else {
			System.out.println("str1과 str2 참조값이 다르다.");
		}
		
		if(str2 == str4) {
			System.out.println("str2과 str4 참조값이 같다.");
		}else {
			System.out.println("str2과 str4 참조값이 다르다.");
		}
		
		
		//문자열 비교(.equals 아주중요한 스트링메서드)
		if(str1.equals(str2)) {
			System.out.println("str1과 str2 참조값이 같다.");
		}else {
			System.out.println("str1과 str2 참조값이 다르다.");
		}
		
	}
	
}
