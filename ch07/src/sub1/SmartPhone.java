package sub1;

public class SmartPhone extends Computer{

	private String brand;
	private String tel;
	private int price;
	private double size;
	
	public SmartPhone(String cpu, 
					  String ram, 
					  String hdd,
					  String brand,
					  String tel,
					  double size,
					  int price) { 
		super(cpu, ram, hdd);
		this.brand = brand;
		this.tel = tel;
		this.size = size;
		this.price = price;

	}
	
	public void call() {
		System.out.println(tel+"번호로 전화거는중...");
	}
	public void info() {
		super.info();
		System.out.println("제품명 : "+brand);
		System.out.println("전화번호 : "+tel);
		System.out.println("화면크기 : "+size);
		System.out.println("가격 : "+price);
		System.out.println("===============");
	}
	
}
