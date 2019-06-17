package sub1;
/*
 * 2019/06/11
 * 클래스 상속 실습 p288
 */
public class InheritanceTest {

	public static void main(String[] args) {
		
		SmartPhone iphone = new SmartPhone("A10", "16GB", "1TB","삼성","010-123-456",333,160);
		SmartPhone gallaxy = new SmartPhone("2.3GHz", "16GB", "1TB","애플","010-123-456",444,320);
		
		iphone.calc();
		iphone.call();
		iphone.info();
		
		gallaxy.calc();
		gallaxy.call();
		gallaxy.info();
		
				
	}
	
}
