package sub2;

public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		
		//length - ���ڿ� ����
		System.out.println("str ���ڿ� ���� : "+str.length());
		
		//CharAt - ���� ����
		System.out.println("str 6��° ���� : "+str.charAt(6));
		
		//substring - ���� �ڸ���
		System.out.println("substring(0, 5) : "+str.substring(0, 5));
		System.out.println("substring(6) : "+str.substring(6));
		
		//indexOf, lastindexOf - Ư�� ���� �ε������� ����
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("idx1 : "+idx1);
		System.out.println("idx2 : "+idx2);
		
		//replace - ���ڿ� ��ü
		String re = str.replace("Korea", "Busan");
		System.out.println("re : "+re);
		
		//valueOf - �Ϲݤ�Ÿ�� ������ ���ڿ��� ��ȯ
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
