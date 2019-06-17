package sub6;
/*
 * 2019/06/13
 * 추상클래스 실습
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		//푸상클래스는 객채생성 안됨
		//Unit unit = new Unit();
		
		Unit unit1 = new Marin();
		Unit unit2 = new Jealot();
		Unit unit3 = new Jergling();
		
		
		unit1.move();
		unit1.attack();

		unit2.move();
		unit2.attack();
			
		unit3.move();
		unit3.attack();
		
	}
	
}
