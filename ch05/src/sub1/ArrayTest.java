package sub1;

/*
 * ��¥ : 2019/04/14
 * �̸� : ��ö��
 * ���� : �迭 �ǽ��ϱ�
*/
public class ArrayTest {
	
	public static void main(String[] args) {
		
		// ���� ������ ����
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// �迭 ����
		int num[] = {1, 2, 3, 4, 5};
		
		// �迭 ����
		for(int i=0 ; i<5 ; i++) {
			System.out.println("�迭 num�� "+(i+1)+"��° ���� : "+num[i]);	
		}
		
		// �迭����
		String person1 = "������";
		String person2 = "������";
		String person3 = "�庸��";
		String person4 = "������";
		String person5 = "�̼���";
		
		String []person = {"������", "������", "�庸��", "������", "�̼���"};
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("person["+i+"] = "+person[i]);
		}
		
		
	}
	
}








