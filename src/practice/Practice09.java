package practice;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		
		/*
		1.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 5
		결과 : 90
		*/
		
		Scanner scanner = new Scanner(System.in);
		int[] nArr = new int[5];
		int i, num;
		
		for(i=0; i<nArr.length; i++) {
			System.out.print("숫자 입력 : ");
			nArr[i] = scanner.nextInt();
		}

		System.out.print("몇번째 수인가요? : ");
		num = scanner.nextInt();
		System.out.println("결과 : " + nArr[num - 1]);
		System.out.println();
		
		
//		int index = scanner.nextInt();
//		System.out.println("5개 정수를 입력하세요 : ");	// 10 20 30 40 50
//		for(i=0; i<nArr.length; i++) {
//			nArr[i] = scanner.nextInt();
//		}
//		System.out.println("결과 : " + nArr[index - 1]);
		
		
		/*
		2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1
		*/
				
		for(i=0; i<nArr.length; i++) {
			System.out.print("숫자 입력 : ");
			nArr[i] = scanner.nextInt();
		}
		
		for(i=nArr.length; i>0; i--) { 			// nArr.length = 5
			System.out.print(nArr[i-1] + " ");	// nArr[5] = X -> nArr[5-1]
		}
		System.out.println();
		
		
		
		/*
		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16
		*/
		
		int j;
		int n=1;
		
		int[][] nArr2 = new int[4][4];
		
		for(i=0; i<nArr2.length; i++) {
			for(j=0; j<nArr2[i].length; j++) {
				nArr2[i][j] = n;
				n++;
			}
		}
		
		for(i=0; i<nArr2.length; i++) {
			for(j=0; j<nArr2[i].length; j++) {
//				System.out.print(nArr2[i][j] + " ");
				System.out.printf("%3d", nArr2[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
