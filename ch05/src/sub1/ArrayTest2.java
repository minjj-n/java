package sub1;

/*
 * Date : 2019/0414
 * Name : ��ö��
 * Subject : ������ �迭 �ǽ��ϱ�
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		
		// 1���� �迭
		int[] korScore = {80, 90, 78, 65, 89, 56, 90, 88, 58, 60};
		
		int sum = 0;
		
		for( int i=0 ; i<korScore.length ; i++ ) {
			sum += korScore[i];
		}
		
		System.out.println("�������� ���� : "+sum);
		System.out.println("�������� ��� : "+sum/korScore.length);
		
		// ����� �迭����
		int mathScore[] = new int[5];
		mathScore[0] = 65;
		mathScore[1] = 78;
		mathScore[2] = 82;
		mathScore[3] = 62;
		mathScore[4] = 96;
		
		int mathSum = 0;
		
		// �迭 �ݺ���
		for(int score : mathScore) {
			mathSum += score;
		}
		
		System.out.println("�������� �� : "+mathSum);
		
		
		// 2���� �迭
		int arr2[][] = {{1, 2, 3}, 
						{4, 5, 6}, 
						{7, 8, 9}, 
						{10, 11, 12}};
		
				
		for(int a=0 ; a<4 ; a++) {
			
			for(int b=0 ; b<3 ; b++) {
				System.out.println("arr2["+a+"]["+b+"] : "+arr2[a][b]);
			}
			
		}
		
		
	}
	
}
