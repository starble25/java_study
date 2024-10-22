package check;

public class Check02 {

	public static void main(String[] args) {
		
		// p.141 3번		
		// for 사용, 1부터 100까지정수중 3의 배수의 총합을 출력
		int i, j;
		int sum = 0;
		
		for(i=1; i<=100; i++) {
			if(i%3 ==0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		System.out.println();
		
		/*
		4번
		
		for 사용
		4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력
		x, y는 10 이하의 자연수
		 */
		
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				if(4*i + 5*j == 60) {
					System.out.println(i + "," + j);
				}
			}
		}
		
		System.out.println();
		
		
		// 6번
		// for 사용
		// *
		// **
		// ***
		// ****
		// *****
		
//		int i, j;
		
		for(i=0; i<5; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
	}

}
