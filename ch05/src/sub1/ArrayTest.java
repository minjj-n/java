package sub1;

/*
 * 날짜 : 2019/04/14
 * 이름 : 김철학
 * 내용 : 배열 실습하기
*/
public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 개별 변수로 생성
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// 배열 생성
		int num[] = {1, 2, 3, 4, 5};
		
		// 배열 참조
		for(int i=0 ; i<5 ; i++) {
			System.out.println("배열 num의 "+(i+1)+"번째 원소 : "+num[i]);	
		}
		
		// 배열연습
		String person1 = "김유신";
		String person2 = "김춘추";
		String person3 = "장보고";
		String person4 = "강감찬";
		String person5 = "이순신";
		
		String []person = {"김유신", "김춘추", "장보고", "강감찬", "이순신"};
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("person["+i+"] = "+person[i]);
		}
		
		
	}
	
}








