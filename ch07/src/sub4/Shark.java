package sub4;

public class Shark extends Animal{

	@Override
	public void move() {
		System.out.println("Shark swim...");
	}
	
	public void hurt() {
		System.out.println("Shark hunt...");
	}
}
