package sub4;

public class PolyTest2 {

	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		 Animal obj[] = {t, e, s};
		
		 obj[0].move();
		 obj[0].move();
		 
		 obj[1].move();
		 obj[1].move();
		 
		 obj[2].move();
		 obj[2].move();
		 
		 move(t);
		 move(e);
		 move(s);
	}//main end
	
	public static void move(Animal a) {
		a.move();
	}
	
}
