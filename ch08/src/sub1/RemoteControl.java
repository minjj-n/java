package sub1;

public interface RemoteControl {

	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();

	public void soundUp();
	public void soundDown();	
	
	//인터페이스는 온전한 메서드 불가
	//public void test() {}
	
}
