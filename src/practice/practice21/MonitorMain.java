package practice.practice21;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1) 삼성 27인치 150,000 검은색
//		2) LG 32인치 330,000
//		1) 1080 * 780
//		2) 흰색, 4096 * 2048

		Monitor m1 = new Monitor("삼성", 27, 150000);
		m1.setColor("검은색");
		Monitor m2 = new Monitor("LG", 32, 330000);
		
		m1.setXY(1080, 780);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		m1.printInfo();
		m2.printInfo();
		
		m2.increasePrice(70000);
		m2.printInfo();

	}

}
