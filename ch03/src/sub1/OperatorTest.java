package sub1;

/*
 * ��¥ : 2019/04/07
 * �̸� : ��ö��
 * ���� : ������ �ǽ��ϱ� ���� p64 
 */
public class OperatorTest {

	public static void main(String[] args) {
		
		// ��� ������
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num2 * num3;
		int rs4 = num4 / num2;
		int rs5 = num4 % 7;
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		
		// ����, ���� ������
		int r1 = num1++; // �� ���� �� ����
		int r2 = ++num2; // �� ���� �� ����
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		
		num3--;
		--num4;
		
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		// ���մ��� ������
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 1; // n1 = n1 + 1;
		n2 -= 2; // n2 = n2 - 2;
		n3 *= 3; // n3 = n3 * 3;
		n4 /= 4; // n4 = n4 / 4;
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("n3 : "+n3);
		System.out.println("n4 : "+n4);		
		
		// �� ������
		int val1 = 1;
		int val2 = 2;
		
		boolean result1 = (val1 > val2);
		boolean result2 = (val1 < val2);
		boolean result3 = (val1 >= val2);
		boolean result4 = (val1 <= val2);
		boolean result5 = (val1 == val2);
		boolean result6 = (val1 != val2);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		System.out.println("result5 : "+result5);
		System.out.println("result6 : "+result6);		
		
		// �� ������
		boolean res1 = (val1 > 2) && (val2 > 3);  // val1�� 2���� ũ�� �׸��� val2�� 3���� ũ��. 
		boolean res2 = (val1 > 0) && (val2 > 3);  // val1�� 0���� ũ�� �׸��� val2�� 3���� ũ��.
		boolean res3 = (val1 > 0) && (val2 >= 2); // val1�� 0���� ũ�� �׸��� val2�� 2���� ũ�ų� ����.
		boolean res4 = (val1 > 0) || (val2 > 3);  // val1�� 0���� ũ�� �Ǵ� val2�� 3���� ũ��.
		boolean res5 = !(val1 > val2); 			  // val1�� val2���� ũ�� �ʴ�.
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
	}
}








