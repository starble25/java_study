package test;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		int pitcherBall;
		int playerInput;
		int outCount = 0;
		int turn = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.printf("< %d회차 >\n", turn);
			
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
				
				if(outCount == 3) {
					outCount = 0;
					turn++;
					break;
				}
			}
			
			if(turn > 3) {
				break;
			}
			
		}
		
	}

}
