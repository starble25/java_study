package test;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int pitcherBall;
		int playerInput;
		int outCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			pitcherBall = (int)(Math.random()*10) + 1;
			System.out.print("1~10중 하나를 입력하세요 : ");
			playerInput = scanner.nextInt();
			
			if( pitcherBall == playerInput ) {
				System.out.println("안타입니다.");
			} else {
				System.out.println("아웃입니다.");
				outCount++;
			}
			
			if(outCount == 3)
				break;
		}
		
	}

}
