package sub2;
/*
 * 2019/06/10
 * 
 */
public class Computer {

	//Ư��(�������)
	private String cpu;
	private String ram;
	private String hdd;
	
	//������
	public Computer(String cpu, String ram, String hdd) {

		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	
	}
	//���(����޼���)
	public void calc() {
		System.out.println("����� �մϴ�...");
		System.out.println("------------------");
	}
	public void internet() {
		System.out.println("���ͳ��� �մϴ�...");
		System.out.println("------------------");
		
	}
	
	public void info() {

		System.out.println("CPU : "+cpu);
		System.out.println("RAM : "+ram);
		System.out.println("HDD : "+hdd);
	}
}
