package sub3;
/*
 * 2019/06/10
 * 클래스 실습
 */
public class AddlerTest {

	public static void main(String[] args) {
		
		Addler ad = new Addler();
		ad.x = 100;
		
		int[] arr = {1,2,3};
		
		ad.add(ad.x);
		System.out.println("ad.x : "+ad.x);
		
		ad.add(ad);
		System.out.println("ad.x : "+ad.x);
		
		ad.add(arr);
		System.out.println("arr[0] : "+arr[0]);
		
		ad = ad.addNew(ad);
		System.out.println("ad.x : "+ad.x);
	}
	
}
