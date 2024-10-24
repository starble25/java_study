package practice;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		/*
		연습문제 - 2

		1.
		2x + 4y = 10 이 만족하는
		모든 x, y 쌍을 구하시오.
		(x와 y는 자연수 1~10)
		*/
		
		int i, j;
		
		
//		for(int i=1; 2*i<10; i++) {
//		for(int j=1; 4*j<10; j++) {
		
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				
//				if(2*i + 4*j > 10)
//					break;
				
				if(2*i + 4*j == 10) {
					System.out.println(i + "," + j);
				}
			}
		}
		// i j
		// i:1 j:2 == 10 	j:3~10(x)
		
		
		System.out.println();
		/*
		2.
		정수 2개를 입력 받아서,
		아래 계산 결과를 출력하시오.
		큰수 - 작은수
		*/
		
		Scanner scanner = new Scanner(System.in);
		int n, m;
		System.out.print("정수 두 개를 입력하세요 : ");
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		if(n-m > 0) {
			System.out.println("결과 : " + (n-m));
		} else if(m-n > 0) {
			System.out.println("결과 : " + (m-n));
		} else {
			System.out.println("같은 수입니다.");
		}
		
		
//		if(n-m > 0) {
//			System.out.println("결과 : " + (n-m));
//		} else {
//			System.out.println("결과 : " + (-1)*(n-m));
//		}
		
		
		System.out.println();
		/*
		3.
		윷놀이 게임
		4개의 윷을 입력받고 결과를 출력하시오.
		(뒷도는 없습니다!)
		0 : 안 뒤집어진 상태
		1 : 뒤집어진 상태
		ex) 입력 0 0 1 0
		결과 도
		입력 0 1 0 1
		결과 개
		*/
		
		int var1, var2, var3, var4;
		System.out.print("4개의 윷을 입력하세요 : ");
		var1 = scanner.nextInt();
		var2 = scanner.nextInt();
		var3 = scanner.nextInt();
		var4 = scanner.nextInt();
		
		int check = var1 + var2 + var3 + var4;
		
		if(check == 1) {
			System.out.println("도");
		} else if(check == 2) {
			System.out.println("개");
		} else if(check == 3) {
			System.out.println("걸");
		} else if(check == 4) {
			System.out.println("윷");
		} else if(check == 0){
			System.out.println("모");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
//		int[] yArr = new int[4];
//		int count = 0;
//		for(i=0; i<yArr.length; i++) {
//			yArr[i] = scanner.nextInt();
//			count += yArr[i];
		
//			count += scanner.nextInt();
//		}
		
//		switch(count) {
//		case 0:
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		}
		
		
		
		
		System.out.println();
		/*
		4. 입력받은 수 만큼 별 출력하기
		ex) 4
		****
		5
		*****
		
		*/

		int num;
		System.out.print("입력 : ");
		num = scanner.nextInt();
		
		for(i=0; i<num; i++) {
			System.out.print("*");
		}
		
		
		
		
	}

}
