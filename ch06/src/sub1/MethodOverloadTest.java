package sub1;

/*
 * ��¥ : 2019/04/21
 * �̸� : ��ö��
 * ���� : �����ε� �޼��� �ǽ��ϱ� ���� p230
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		overload();
		overload(1);
		overload("ȫ�浿");
		overload(true);
		overload(false);
	}
	
	public static void overload() {
		System.out.println("ù��° �����ε� �޼���");
	}
	
	public static void overload(int num) {
		System.out.println("�ι�° �����ε� �޼���");
	}
	
	public static void overload(String name) {
		System.out.println("����° �����ε� �޼���");
	}
	
	public static void overload(boolean isOk) {
		System.out.println("�׹�° �����ε� �޼���");
	}
	
}
