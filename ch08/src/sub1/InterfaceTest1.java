package sub1;

import java.awt.image.SampleModel;

/*
 * 2019/06/13
 * �������̽� �ǽ� 1 ���� p344
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		//�������̽� �ǽ�1 - Ŭ������ ǥ�ذ��̵忪��
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
