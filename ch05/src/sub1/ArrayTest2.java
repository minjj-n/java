package sub1;

/*
 * Date : 2019/0414
 * Name : 김철학
 * Subject : 다차원 배열 실습하기
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		
		// 1차원 배열
		int[] korScore = {80, 90, 78, 65, 89, 56, 90, 88, 58, 60};
		
		int sum = 0;
		
		for( int i=0 ; i<korScore.length ; i++ ) {
			sum += korScore[i];
		}
		
		System.out.println("국어점수 총합 : "+sum);
		System.out.println("국어점수 평균 : "+sum/korScore.length);
		
		// 명시적 배열생성
		int mathScore[] = new int[5];
		mathScore[0] = 65;
		mathScore[1] = 78;
		mathScore[2] = 82;
		mathScore[3] = 62;
		mathScore[4] = 96;
		
		int mathSum = 0;
		
		// 배열 반복문
		for(int score : mathScore) {
			mathSum += score;
		}
		
		System.out.println("수학점수 합 : "+mathSum);
		
		
		// 2차원 배열
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
