package sub2;

/*
 * 날짜 : 2019/04/07
 * 이름 : 김철학
 * 내용 : 변수의 자료형(데이터 타입) 교재 p38 
 */
public class DataTypeTest {

	public static void main(String[] args) {
		
		// 논리형
		boolean var1 = true;	
		boolean var2 = false;
		
		// 문자형
		char var3 = 'A';
		char var4 = '가';
		
		// 문자열(단어)
		String var5 = "Apple";
		String var6 = "사과";
		
		// 정수형
		byte num1 = 1;
		short num2 = 127;
		int var7 = 7;
		int var8 = -8;
		int var9 = 214748364;
		long var10 = 9223372036854775807L;
		
		// 실수형
		float  var11 = 1.123456789f;
		double var12 = 1.12345678901234567890;
		
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("var9 : "+var9);
		System.out.println("var10 : "+var10);
		System.out.println("var11 : "+var11);
		System.out.println("var12 : "+var12);
		
	}
	
}
