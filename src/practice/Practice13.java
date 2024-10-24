package practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		
		/*
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
		
		*/
		int i, j;
		for(i=0; i<5; i++) {
			for(j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
		
		*/
		
		for(i=0; i<4; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		/*
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int n = scanner.nextInt();
		
		for(i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		
		System.out.println();
		
		/*
		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		*

		입력 : 3

		*
		**
		***
		**
		*

		*/
		
//		int i, j;
		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		
		for(i=0; i<num; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=0; i<num; i++) {
			for(j=num-1; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		/*
		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		*/
		
//		1:10개, 2:9개, 3:8개 ...
//		int i, j;
		int sum = 0;
		for(i=1; i<=10; i++) {
			sum = sum + i * (11 - i);
		}
		System.out.println(sum);
		
//		sum = 0;
//		for(i=1; i<=10; i++) {
//			for(j=1; j<=i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
		
		
		System.out.println();
		
		/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		*/
		
		int total = 0;
		int number = 1;
		
		while(total < 100) {
			if(number%2 == 0) {
				total = total - number;
			} else {
				total = total + number;
			}
			number++;
		}
		
		number--;
		
		System.out.printf("%d 까지 더했을 때 총합 : %d", number, total);
		
		
		
	}

}
