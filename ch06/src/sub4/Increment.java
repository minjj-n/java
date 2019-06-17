package sub4;

public class Increment {

	private int num1;	
	private static int num2;
	
	
	//클래스변수, 정적변수
	public Increment() {
		
		this.num1++;
		this.num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
	}
	
	
	//클래스 메서드
	public static void add() {
		//static 메서드에서는 none static 변수를 참조할 수 없다.
		//num1++;
		
		num2++;
	}
	
}
