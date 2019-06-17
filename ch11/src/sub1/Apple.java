package sub1;


//Java의 모든 클래스는 오브젝트를 상속받는다.
public class Apple extends Object{

	private String country;
	private int    price;
	
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
	}
	
	public void info() {
		System.out.println("원산지 : "+country);
		System.out.println("가  격 : "+price);
	}
	
}
