package sub2;

/*
 * ��¥ : 2019/06/07
 * �̸� : ��ö��
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� 
 */
public class ClassTest {
	
	public static void main(String[] args) {

		// ��ü����
		Account kb = new Account("��������","112-12-1234","������",10000);
		
		kb.deposit(10000);
		kb.withdraw(7000);
		
		//private �ܺ�����
		//kb.money -= 1;
		
		kb.show();
		
		
		Account sh = new Account("��������","111-13-1234","������",50000);
		
		sh.deposit(5000);
		sh.withdraw(9000);
		sh.show();
		
		//�Ｚ ��ü
		Computer samsung = new Computer("Intel i7", "16GB", "1TB");
		
		samsung.calc();
		samsung.internet();
		samsung.info();
		
		//���� ��ü
		Computer apple = new Computer("Intel i5", "8GB", "512GB");
		
		apple.calc();
		apple.internet();
		apple.info();
	
	} 
	
}
