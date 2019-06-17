package sub2;

/*
 * 날짜 : 2019/04/14
 * 이름 : 김철학
 * 내용 : while문 실습하기
*/
public class WhileTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int k = 1;
		int sum = 0;
		
		while( k <= 10 ) {
			
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		// do ~ while
		
		int tot = 0;
		int i = 1;
		
		do {
			
			if( i % 2 == 1 ) {
				tot += i;	
			}			
			
			i++;
			
		}while( i <= 10);
		
		
		System.out.println("1부터 10까지 홀수합 : "+tot);
		
		// break
		int num = 1;
		
		while(true) {
			
			if( num%5 == 0 && num%7 == 0 ) {
				break; // 반복문 종료
			}
			
			num++;
		}
		
		System.out.println("5와 7의 최소공배수 : "+num);
		
		// continue
		int total = 0;
		
		for( int a=1 ; a<=10 ; a++ ) {
			
			
			if( a%2 == 0 ) {				
				continue; // 반복문의 상위로 이동
			}
			
			total += a;		
			
		}
		
		System.out.println("1부터 10까지 홀수합 : "+total);
		
		
		
	}
}






