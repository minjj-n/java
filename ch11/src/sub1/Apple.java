package sub1;


//Java�� ��� Ŭ������ ������Ʈ�� ��ӹ޴´�.
public class Apple extends Object{

	private String country;
	private int    price;
	
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
	}
	
	public void info() {
		System.out.println("������ : "+country);
		System.out.println("��  �� : "+price);
	}
	
}
