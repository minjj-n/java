package sub2;
/*
 * 2019/06/17
 * �����
 * String Ŭ���� �ǽ� ���� p496
 */
public class StringTest {

	public static void main(String[] args) {
		
		//���ڿ� = ���� + �迭
		String str = "Hello";
		
		
		//���� + �迭
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		
		//���ڿ� ����
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "Hello";
		
		if(str1 == str2) {
			System.out.println("str1�� str2 �������� ����.");
		}else {
			System.out.println("str1�� str2 �������� �ٸ���.");
		}
		
		if(str2 == str4) {
			System.out.println("str2�� str4 �������� ����.");
		}else {
			System.out.println("str2�� str4 �������� �ٸ���.");
		}
		
		
		//���ڿ� ��(.equals �����߿��� ��Ʈ���޼���)
		if(str1.equals(str2)) {
			System.out.println("str1�� str2 �������� ����.");
		}else {
			System.out.println("str1�� str2 �������� �ٸ���.");
		}
		
	}
	
}
