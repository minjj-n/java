package sub6;

//추상클래스
// - 추상메서드를 포함하는 클래스
// - 상속을 위한 클래스
public abstract class Unit {

	
	//추상메서드
	public abstract void attack();
	
	public void move() {
		System.out.println("Unit move...");
	}
	
}
