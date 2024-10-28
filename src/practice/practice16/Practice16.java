package practice.practice16;

public class Practice16 {

	public static void main(String[] args) {
//		제조사:삼성 모델명:더프레임 인치:65인치
//		제조사:LG 모델명:올레드 인치:80인치

		Monitor monitor1 = new Monitor(65, "삼성", "더프레임");
		Monitor monitor2 = new Monitor(80, "LG", "올레드");
		
		monitor1.printInfo();
		monitor2.printInfo();
	}

}

