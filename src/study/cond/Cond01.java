package study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if문
		
		int num = 15;
		int x = 10;
		
		if(num > 10) {
			System.out.println("확인을 해보니까");
			System.out.println("10보다 큼");
			x = 20;  // ( 사용가능 )
			int y = 30;
		} else {
			System.out.println("10보다 안큼");
		}
		
		boolean b = num == 15;	// true / false
		
//		b == true / b == false / b / !b
		if( b ) {
			System.out.println("한번 더 살펴보니");
			System.out.println("15랑 똑같음");
		}
		
//		y = 50; ( 사용불가 )
		
		System.out.println("끝");
		
	}
}
