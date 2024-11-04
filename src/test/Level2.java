package test;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		int pitcherBall;
		int playerInput;
		int outCount = 0;
		int turn = 1;
		int turnCount = 0;
		int playerCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		String[] playerName = new String[9];
		int[] playerNumber = new int[9];
		
		for(int i=0; i<playerName.length; i++) {
			playerName[i] = "이름" + (i+1);
		}
		
		for(int i=0; i<playerNumber.length; i++) {
			playerNumber[i] = (i + 1);
		}
		
		while(true) {
			
			System.out.printf("< %d회차 >\n", turn);
			System.out.printf("%d번타자 %s\n", playerNumber[playerCount], playerName[playerCount]);
			
			while(true) {
				
				pitcherBall = (int)(Math.random()*10) + 1;
				System.out.print("1~10중 하나를 입력하세요 : ");
				playerInput = scanner.nextInt();
				
				if( pitcherBall == playerInput ) {
					System.out.println("안타입니다.");
					playerCount++;
					break;
				} else {
					System.out.println("아웃입니다.");
					outCount++;
				}
				
				if(outCount == 1) {
					outCount = 0;
					playerCount++;
					turnCount++;
					break;
				}
			}
			
			if(playerCount == 8) { // 9번타자 다음 1번타자
				playerCount = 0;
			}
			
			if(turnCount == 3) { // 3아웃시 다음회차
				turnCount = 0;
				turn++;
			}
			
			if(turn > 3) {
				break;
			}
			
		}
		
	}

}
