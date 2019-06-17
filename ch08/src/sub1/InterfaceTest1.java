package sub1;

import java.awt.image.SampleModel;

/*
 * 2019/06/13
 * 인터페이스 실습 1 교재 p344
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		//인터페이스 실습1 - 클래스의 표준가이드역할
		RemoteControl lg 	  = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		
		samsung.powerOn();
		samsung.soundDown();
		samsung.powerOff();
		
		
		
	}
	
}
