package sub2;


public class Account {
	
	// Ư��(�������)
	// ĸ��ȭ - ������� �������������ڸ� private�� �����ؼ� �ܺ������� ����
	private String bank;
	private String id;
	private String name;
	private int money;
	
	//������
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	// ���(����޼���)
	public void deposit(int money) {
		this.money += money;
	}


	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("==================");
		System.out.println("�� �� �� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�� �� �� : "+name);
		System.out.println("�����ܾ� : "+money);
		System.out.println("------------------");
	}
}



