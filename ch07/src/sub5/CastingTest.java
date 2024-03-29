package sub5;

import sub4.Animal;
import sub4.Eagle;
import sub4.Tiger;

/*
 * 2019/06/13
 * 캐스팅 실습 교재 p306
 */
public class CastingTest {

	public static void main(String[] args) {
		
		//캐스팅
		double num1 = 1.23;
		int    num2 = (int) num1;
		
		float  num3 = 5;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		
		//업캐스팅(다형성)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		
		//다운캐스팅 
		Tiger t = (Tiger) a1;
		Eagle e = (Eagle) a2;
		
		t.move();
		e.move();
		
		
	}
	
}
