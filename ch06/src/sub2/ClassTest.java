package sub2;

/*
 * 날짜 : 2019/06/07
 * 이름 : 김철학
 * 내용 : 자바 클래스 실습하기 
 */
public class ClassTest {
	
	public static void main(String[] args) {

		// 객체생성
		Account kb = new Account("국민은행","112-12-1234","김유신",10000);
		
		kb.deposit(10000);
		kb.withdraw(7000);
		
		//private 외부참조
		//kb.money -= 1;
		
		kb.show();
		
		
		Account sh = new Account("신한은행","111-13-1234","김춘추",50000);
		
		sh.deposit(5000);
		sh.withdraw(9000);
		sh.show();
		
		//삼성 객체
		Computer samsung = new Computer("Intel i7", "16GB", "1TB");
		
		samsung.calc();
		samsung.internet();
		samsung.info();
		
		//애플 객체
		Computer apple = new Computer("Intel i5", "8GB", "512GB");
		
		apple.calc();
		apple.internet();
		apple.info();
	
	} 
	
}
