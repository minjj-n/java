package sub2;

public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		
		//length - 문자열 길이
		System.out.println("str 문자열 길이 : "+str.length());
		
		//CharAt - 문자 추출
		System.out.println("str 6번째 문자 : "+str.charAt(6));
		
		//substring - 문자 자르기
		System.out.println("substring(0, 5) : "+str.substring(0, 5));
		System.out.println("substring(6) : "+str.substring(6));
		
		//indexOf, lastindexOf - 특정 문자 인덱스값을 추출
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("idx1 : "+idx1);
		System.out.println("idx2 : "+idx2);
		
		//replace - 문자열 교체
		String re = str.replace("Korea", "Busan");
		System.out.println("re : "+re);
		
		//valueOf - 일반ㅌ타입 변수를 문자열로 변환
		int 	var1 = 11;
		double  var2 = 1.12345;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
		
	}
	
}
