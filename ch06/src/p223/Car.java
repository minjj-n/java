package p223;

public class Car {

	//�ʵ�
	public int gas;
	
	//������
	
	//�޼���
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
			//false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
		//true�� ����
	}
	
	public void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas +")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas +")");
				return;
			}
			
		}
	}
	
}
