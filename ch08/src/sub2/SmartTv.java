package sub2;

public class SmartTv extends Tv implements Computer, ChromeCast{

	@Override
	public void booting() {
		System.out.println("SmartTV - botting!!");
	}

	@Override
	public void internet() {
		System.out.println("SmartTV - internet..");
	}

	@Override
	public void syncAndroid() {
		System.out.println("SmartTV - 안드로이드캐스트");
		
	}

	
	
	
	
}
