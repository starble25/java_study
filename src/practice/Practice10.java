package practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[3];
		
		System.out.print("국어점수 : ");
		score[0] = scanner.nextInt();
		
		System.out.print("수학점수 : ");
		score[1] = scanner.nextInt();
		
		System.out.print("영어점수 : ");
		score[2] = scanner.nextInt();
		
		int sum = score[0] + score[1] + score[2];
		double avg = (double)sum / score.length;
		
		if(score[0] >= 40 && score[1] >=40 && score[2] >=40 && avg >= 60) {
			System.out.println("국어 : " + score[0]);
			System.out.println("국어 : " + score[1]);
			System.out.println("국어 : " + score[2]);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
	}

}
