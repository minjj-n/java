package sub2;
/*
 * 2019/06/12
 * 클래스 상속 실습 겨재 p288
 */
public class InheritTest {

	public static void main(String[] args) {
		
		SalaryStudent std1 = new SalaryStudent("김유신", 21, "부경대", "컴퓨터", "삼성");
		SalaryStudent std2 = new SalaryStudent("김춘추", 22, "경성대", "경영", "LG");
		
		std1.hello();
		std2.hello();
		
	}
	
}
