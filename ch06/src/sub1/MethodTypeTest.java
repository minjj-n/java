package sub1;

/*
 ��¥ : 2019/04/14
 �̸� : ��ö��
 ���� : �޼��� Ÿ�� �ǽ��ϱ�
*/
public class MethodTypeTest {

	public static void main(String[] args) {
		
		int rs1 = type1(2, 3);		
		System.out.println("rs1 : "+rs1);
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		type2(arr);
		
		double result = type3() * 5 * 5;
		System.out.println("������ 5�� ���� ���� : "+result);
		
		type4();
		
		// ������ �Լ� ����
		gugudan(2);
		gugudan(3);
		gugudan(7);
	}
	
	// gugudan �޼��� ����
	public static void gugudan(int num) {
		
		System.out.println(num+"�� ���");
		
		for(int k=1 ; k<=9 ; k++) {
			System.out.println(num+" x "+k+" = "+(num*k));	
		}
	}
	
	
	// type1 - �Ű����� O, ���ϰ� O
	public static int type1(int x, int y) {
		int z = x + y;
		return z;
	}
	
	// type2 - �Ű����� O, ���ϰ� X
	public static void type2( int[] arr ) {
		
		int sum = 0;
		
		for(int score : arr) {
			sum += score;
		}
		
		System.out.println("�迭�� ���� : "+sum);
	}
	
	// type3 - �Ű����� X, ���ϰ� O
	public static double type3() {		
		return 3.14;
	}
	
	// type4 - �Ű����� X, ���ϰ� X
	public static void type4() {
		int result = type1(7, 9);
		System.out.println("7�� 9�� �� : "+result);
	}
	
}






