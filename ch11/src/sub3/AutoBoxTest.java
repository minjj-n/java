package sub3;

public class AutoBoxTest {

	public static void main(String[] args) {
		
		//����ڽ�
		Boolean box1 = false;
		Integer box2 = 2;
		Double  box3 = 3.14;
		Float   box4 = 3.14f;
		
		//�����ڽ�
		boolean ubox1 = box1;
		int     ubox2 = box2;
		double  ubox3 = box3;
		float   ubox4 = box4;
		
		System.out.println("ubox1 : "+ubox1);
		System.out.println("ubox1 : "+ubox2);
		System.out.println("ubox1 : "+ubox3);
		System.out.println("ubox1 : "+ubox4);
		
	}
	
}
