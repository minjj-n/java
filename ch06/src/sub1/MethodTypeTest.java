package sub1;

/*
 날짜 : 2019/04/14
 이름 : 김철학
 내용 : 메서드 타입 실습하기
*/
public class MethodTypeTest {

	public static void main(String[] args) {
		
		int rs1 = type1(2, 3);		
		System.out.println("rs1 : "+rs1);
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		type2(arr);
		
		double result = type3() * 5 * 5;
		System.out.println("반지름 5인 원의 넓이 : "+result);
		
		type4();
		
		// 구구단 함수 실행
		gugudan(2);
		gugudan(3);
		gugudan(7);
	}
	
	// gugudan 메서드 정의
	public static void gugudan(int num) {
		
		System.out.println(num+"단 출력");
		
		for(int k=1 ; k<=9 ; k++) {
			System.out.println(num+" x "+k+" = "+(num*k));	
		}
	}
	
	
	// type1 - 매개변수 O, 리턴값 O
	public static int type1(int x, int y) {
		int z = x + y;
		return z;
	}
	
	// type2 - 매개변수 O, 리턴값 X
	public static void type2( int[] arr ) {
		
		int sum = 0;
		
		for(int score : arr) {
			sum += score;
		}
		
		System.out.println("배열의 총합 : "+sum);
	}
	
	// type3 - 매개변수 X, 리턴값 O
	public static double type3() {		
		return 3.14;
	}
	
	// type4 - 매개변수 X, 리턴값 X
	public static void type4() {
		int result = type1(7, 9);
		System.out.println("7과 9의 합 : "+result);
	}
	
}






