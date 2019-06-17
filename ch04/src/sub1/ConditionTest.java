package sub1;

/*
 * ��¥ : 2019/04/07
 * �̸� : ��ö��
 * ���� : ���ǹ� �ǽ��ϱ� ���� p108
 */
public class ConditionTest {
	
	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			// if���� ���϶� ����
			System.out.println("num1�� num2���� ũ��.");			
		}
		
		
		if(num1 > 0) {
			if(num2 > 1) {
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
			}
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1�� 0���� ũ�� �׸��� num2�� 1���� ũ��.");
		}
		
		// if ~ else
		int val1 = 1;
		int val2 = 2;		
		
		if( val1 > val2 ) {
			// ������ ���� ��� ����
			System.out.println("val1�� val2���� ũ��.");
		}else {
			// ������ ������ ��� ����			
			System.out.println("val1�� val2���� �۴�.");
		}
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			System.out.println("n1�� n2���� ũ��.");
		}else if(n2 > n3) {
			System.out.println("n2�� n3���� ũ��.");
		}else if(n3 > n4) {
			System.out.println("n3�� n4���� ũ��.");
		}else {
			System.out.println("n4�� ���� ũ��.");
		}
		
		// switch
		String fruit = "mango";
		
		switch(fruit) {
		
			case "apple":
				System.out.println("������ ����Դϴ�.");
				break;
				
			case "grape":
				System.out.println("������ �����Դϴ�.");
				break;
				
			case "orange":
				System.out.println("������ �������Դϴ�.");
				break;
				
			default:
				System.out.println("�ش��ϴ� ������ �����ϴ�.");
				break;
		}
		
		System.out.println("���α׷� ����...");
	}	
}
