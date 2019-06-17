package sub4;
/*
 * 다형성 실습 p305
 * 
 */
public class PolyTest {

	public static void main(String[] args) {
		
		Animal t = new Tiger();
		Animal e = new Eagle();
		Animal s = new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		
	}
	
}
