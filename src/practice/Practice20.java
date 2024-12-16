package practice;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i + j == 6) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
		
//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
		
		int[] lotto = new int[6];
		int x = 0;
		
		while(true) {
			if(x == 0) { // 첫번째는 중복 없음
				lotto[x] = (int)(Math.random()*45 + 1);
				x++;
				continue;
			}
			
			// 중복확인
			boolean isIn = false;
			int temp = (int)(Math.random()*45 + 1);
			for(int i=0; i<x; i++) {
				if(temp == lotto[i])
					isIn = true;
			}
			if(isIn) { // 중복일시 x값 증가없이 while문 재시작
				continue;
			} else {
				lotto[x] = temp;
				x++;
			}
			if(x > 5) {
				break;				
			}
		}
		
		System.out.print("로또번호 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
//		3.
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20
		
		int[] class1 = new int[5];
		int[] class2 = new int[5];
		int[] class3 = new int[5];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1반 점수 입력 : ");
		for(int i=0; i<5; i++) {
			class1[i] = scanner.nextInt();
			sum1 += class1[i];
		}
		System.out.print("2반 점수 입력 : ");
		for(int i=0; i<5; i++) {
			class2[i] = scanner.nextInt();
			sum2 += class2[i];
		}
		System.out.print("3반 점수 입력 : ");
		for(int i=0; i<5; i++) {
			class3[i] = scanner.nextInt();
			sum3 += class3[i];
		}
		
		System.out.printf("1반 평균 : %d\n", sum1 / 5);
		System.out.printf("2반 평균 : %d\n", sum2 / 5);
		System.out.printf("3반 평균 : %d\n", sum3 / 5);
		System.out.printf("전체 평균 : %f\n", (sum1/5 + sum2/5 + sum3/5) / 3.0);
		
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270
		
		
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		
		int[][] arr2 = new int[arr.length+1][arr[0].length+1];
		int sumRow = 0;
		int sumCol = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr2[i][j] = arr[i][j];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				sumRow += arr2[i][j];
				arr2[i][arr2[0].length-1] = sumRow;
				
				sumCol += arr2[j][i];
				arr2[arr2.length-1][i] = sumCol;
			}
			arr2[arr2.length-1][arr2[0].length-1] += sumRow + sumCol;
			sumRow = 0;
			sumCol = 0;
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.printf("%3d ", arr2[i][j]);
			}
			System.out.println();
		}
		
	}

}
