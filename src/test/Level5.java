package test;

import java.util.Scanner;

public class Level5 {

	public static void main(String[] args) {
		int pitcherBall;
		int playerInput;
//		int outCount = 0;
		int turn = 1;
		int turnCount = 0;
		int playerCount = 0;
		int score = 0;
		
//		Scanner scanner = new Scanner(System.in);
		
		String[] playerName = new String[9];
		int[] playerNumber = new int[9];
		int[] playerHit = new int[9];
		int[] playerTurn = new int[9];
		
		int[] playerBase = new int[9]; // 0루(0)   1루, 2루, 3루, 홈(4)
										
		
		for(int i=0; i<playerName.length; i++) {
			playerName[i] = "이름" + (i+1);
		}
		
		for(int i=0; i<playerNumber.length; i++) {
			playerNumber[i] = (i + 1);
		}
		
		while(true) {
			int strike = 0;
			int ball = 0;
			
			double hitRate = (double)playerHit[playerCount] / playerTurn[playerCount];
			if(playerTurn[playerCount] == 0)
				hitRate = 0;
			
			System.out.printf("< %d회차 >\n", turn);
			System.out.printf("%d번타자 %s 타율:%f\n", playerNumber[playerCount], playerName[playerCount], 
					hitRate);
			
			while(true) {
				
				pitcherBall = (int)(Math.random()*100) + 1;
				playerInput = (int)(Math.random()*100) + 1;
				playerTurn[playerCount]++;
				
				if( playerInput >= (pitcherBall - 3) && playerInput <= (pitcherBall + 3) ) {
					System.out.println("안타입니다.");
					playerHit[playerCount]++;
					
					for(int i=0; i<=playerCount; i++) { // 안타칠시 1루씩+
						playerBase[i]++;
						
						if(playerBase[i] == 4) { // 홈에 들어오면 +1점, 0루로 초기화
							score += 1;
							playerBase[i] = 0;
						}
					}
					
					playerCount++;
					break;
				} else if(pitcherBall>=1 && pitcherBall<=20) {
					System.out.println("스트라이크.");
					strike++;
				} else if(pitcherBall>=50 && pitcherBall<=60) {
					System.out.println("스트라이크.");
					strike++;
				} else if(pitcherBall>=90 && pitcherBall<=100) {
					System.out.println("스트라이크.");
					strike++;
				} else {
					System.out.println("볼.");
					ball++;
				}
				
				if(strike == 3) {
					playerCount++;
					turnCount++;
					break;
				}
				if(ball == 4) { // = 안타
					playerHit[playerCount]++;
					
					for(int i=0; i<=playerCount; i++) {  // 안타칠시 1루씩+
						playerBase[i]++;
						
						if(playerBase[i] == 4) {  // 홈에 들어오면 +1점, 0루로 초기화
							score += 1;
							playerBase[i] = 0;
						}
					}
					
					playerCount++;
					turnCount++;
					break;
				}
			}
			
			if(playerCount > 8) { // 9번타자 다음 1번타자
				playerCount = 0;
			}
			
			if(turnCount == 3) { // 3아웃시 다음회차
				
				for(int i=0; i<playerBase.length; i++) { // 전체 0루로 초기화
					playerBase[i] = 0;
				}
				
				turnCount = 0;
				turn++;
			}
			
			if(turn > 3) {
				System.out.println("===== 게임종료 =====");
				System.out.println("최종 점수 : " + score);
				break;
			}
			
		}
		
	}

}
