package practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		/*
		연습문제 - 1
		*/
		// 1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		Scanner scanner = new Scanner(System.in);
		int integer;
		
		System.out.print("정수 입력 : ");
		integer = scanner.nextInt();
		
		if(integer%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
//		switch(integer%2) {
//		case 0:
//			System.out.println("even");
//			break;
//		case 1:
//			System.out.println("odd");
//		}

		
		// 2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		
		int integer2;
		System.out.print("정수 입력: ");
		integer2 = scanner.nextInt();
		
		if(integer2%7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다");
		}
		
		
		System.out.println();
		
		// 3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		
		int i;
		int sum = 0;
		
		for(i=1; i<=1000; i++) {
			if(i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
//		for(i=5; i<=1000; i=i+5) {
//			sum = sum + i;
//		}
		
		System.out.println();
		
		// 4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		// ex) 입력 : 10
		// 결과 : **********
		
		int n;
		System.out.print("1~50중 입력 : ");
		n = scanner.nextInt();
		
//		if(num >= 1 && num <=50)
		for(i=0; i<n; i++) {
			System.out.print("*");
		}
		
		
		System.out.println();
		
		// 5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		// ex) 1 - 2 + 3 - 4 .....
		
		int sum2 = 0;
		
		for(i=1; i<=10; i++) {
			if(i%2 != 0) {
				sum2 = sum2 + i;
			} else {
				sum2 = sum2 - i;
			}
		}
		System.out.println(sum2);
		

		System.out.println();
		
		// 6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		// 1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		
		int sum3 = 0;
		
		for(i=1; sum3<1000; i++) {
			if(sum3 < 1000) {
				sum3 = sum3 + i;
			}
		}
		System.out.println(sum3);
		
		
//		int total = 0;
//		int k = 1;
//		while(total<1000) {
//			total = total + k;
//			k++;
//		}
		

		System.out.println();
		
		/*
		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		ex) 입력 3
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		...
		3 * 9 = 27
		*/
		
		int num;
		System.out.print("1~9중 입력 : ");
		num = scanner.nextInt();
		
		for(i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		
		
		
	}

}
