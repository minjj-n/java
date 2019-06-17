package sub4;
/*
 * 2019/06/10
 * static 실습 
 */
public class StaticTest {

	public static void main(String[] args) {
		
		Increment inc1 = new Increment();		
		Increment inc2 = new Increment();		
		Increment inc3 = new Increment();		
	
		//inc1.num2 = 2;
		inc1.add();
		
		//클래스변수, 클래스메서드는 이미 고정할당영역에 생성되어있음.
		//객체 생성없이 바로 실행(참조) 할 수 있다.
		//Increment.num2 = 2;
		Increment.add();
	
		
		//싱글톤 객체열기
		//Calc cal = new Calc();
		
		Calc cal = Calc.getInstance();
		int r1 = cal.plus(1, 3);
		int r2 = cal.minus(1, 3);
		int r3 = cal.multi(1, 3);
		int r4 = cal.div(1, 3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}
	
	
	
}
