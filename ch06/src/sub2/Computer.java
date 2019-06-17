package sub2;
/*
 * 2019/06/10
 * 
 */
public class Computer {

	//특성(멤버변수)
	private String cpu;
	private String ram;
	private String hdd;
	
	//생성자
	public Computer(String cpu, String ram, String hdd) {

		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	
	}
	//기능(멤버메서드)
	public void calc() {
		System.out.println("계산을 합니다...");
		System.out.println("------------------");
	}
	public void internet() {
		System.out.println("인터넷을 합니다...");
		System.out.println("------------------");
		
	}
	
	public void info() {

		System.out.println("CPU : "+cpu);
		System.out.println("RAM : "+ram);
		System.out.println("HDD : "+hdd);
	}
}
