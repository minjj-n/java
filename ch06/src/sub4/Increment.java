package sub4;

public class Increment {

	private int num1;	
	private static int num2;
	
	
	//Ŭ��������, ��������
	public Increment() {
		
		this.num1++;
		this.num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
	}
	
	
	//Ŭ���� �޼���
	public static void add() {
		//static �޼��忡���� none static ������ ������ �� ����.
		//num1++;
		
		num2++;
	}
	
}
