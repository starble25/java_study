package practice;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		자바 연습문제

		Hint
		i, j 값 변화 추적 -> 규칙 찾기
		print
		println


		※규칙을 찾아보고 작성
		1) 반복문 1개로 결과 만들기
		2)반복문 2개 중첩해서 결과만들기

		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
		12345
		12345
		12345
		12345
		12345

		//2.
		11111
		22222
		33333
		44444
		55555
		*/
		
		int i, j;
		
		for(i=1; i<=5; i++) {
			System.out.println("12345");
		}
		System.out.println();
		
		for(i=1; i<=5; i++) {
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.println();
		}
		System.out.println();
		
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
