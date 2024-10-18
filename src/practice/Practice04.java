package practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연습문제.

		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
		double width, height;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		width = scanner.nextDouble();
		System.out.print("높이 : ");
		height = scanner.nextDouble();
		
		System.out.printf("삼각형의 넓이 : %f\n", (width + height)/2);
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("밑변 : ");
//		int width = scanner.nextInt();
//		System.out.print("높이 : ");
//		int height = scanner.nextInt();
//		
//		System.out.printf("삼각형의 넓이 : %f\n", ( (double)width + height)/2 );
//		System.out.printf("삼각형의 넓이 : %f\n", ( width + height)/2.0 );
		
		

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
//		Scanner scanner = new Scanner(System.in);
		double upperBase, lowerBase, height2;
		System.out.print("윗변 : ");
		upperBase = scanner.nextDouble();
		System.out.print("밑변 : ");
		lowerBase = scanner.nextDouble();
		System.out.print("높이 : ");
		height2 = scanner.nextDouble();
		
		System.out.printf("사다리꼴의 넓이 : %f\n", (upperBase + lowerBase) * height2 / 2);
		

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		
		int people = 24;
		int snack = 100;
		
		System.out.printf("한 명당 %d개의 과자를 받음, %d개 남음\n", snack/people, snack%people);

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8

//		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("세자리 정수 입력 : ");
		num = scanner.nextInt();
		
		System.out.println("백의 자리 : " + (num / 100) );			// 158 / 100 = 1
		System.out.println("십의 자리 : " + (num % 100) / 10 );	// 58 / 10 = 5
		System.out.println("일의 자리 : " + (num % 10 ) );			// 158 / 10 = 15.8
		

		/*
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		//
		//
		System.out.println("x="+x+ " y="+y);
		*/
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		
		int z = x;
		x = y;
		y = z;
		System.out.println("x="+x+ " y="+y);
		
	}

}
