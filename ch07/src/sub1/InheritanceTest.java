package sub1;
/*
 * 2019/06/11
 * Ŭ���� ��� �ǽ� p288
 */
public class InheritanceTest {

	public static void main(String[] args) {
		
		SmartPhone iphone = new SmartPhone("A10", "16GB", "1TB","�Ｚ","010-123-456",333,160);
		SmartPhone gallaxy = new SmartPhone("2.3GHz", "16GB", "1TB","����","010-123-456",444,320);
		
		iphone.calc();
		iphone.call();
		iphone.info();
		
		gallaxy.calc();
		gallaxy.call();
		gallaxy.info();
		
				
	}
	
}
