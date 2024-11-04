package test;

public class Level7 {

	public static void main(String[] args) {
		int pitcher; //투수
		int batter;	 //타자
		int index = 0;
		int outCount = 0;
		int turn = 1; //1회차
		int score = 0;
		
		String[] batterNameArr = new String[9];
		for(int i=0; i<batterNameArr.length; i++) {
			batterNameArr[i] = "이름" + (i+1);
		}
		int[] batterHitArr = new int[9];	//안타수
		int[] batterSwingArr = new int[9];	//전체타수
		int[] batterBaseArr = new int[9];	//베이스
		int[] batterBallArr = new int[9];	//볼넷
		int[] batterOutArr = new int[9];	//아웃
		int[] homeRunCountArr = new int[9];	//홈런수
		int[] homeRunProArr = new int[9];	//홈런확률
		for(int i=0; i<homeRunProArr.length; i++) { // 타자 홈런확률 세팅
			homeRunProArr[i] = (int)(Math.random()*60) + 1;
		}
		
		while(true) { // 회차시작
			int strike = 0;
			int ball = 0;
			
			double hitRate = (double)batterHitArr[index] / batterSwingArr[index];
			if(batterSwingArr[index] == 0) { // 타수(분모) 0일때 타율0
				hitRate = 0;
			}
			System.out.printf("%d번타자 %s 타율:%f\n",index+1 ,batterNameArr[index] , hitRate);
			System.out.printf("	   안타:%d 볼넷:%d 아웃:%d 홈런:%d\n",batterHitArr[index], 
					batterBallArr[index], batterOutArr[index], homeRunCountArr[index]);
		
			while(true) {
				int homeRunChance = (int)(Math.random() * 100) + 1; // 홈런 난수 1~100
				pitcher = (int)(Math.random() * 100) + 1;
				batter = (int)(Math.random() * 100) + 1;
				batterSwingArr[index] = batterSwingArr[index] + 1;
				
				if(batter >= pitcher - 3 && batter <= pitcher + 3) { // 안타
					batterHitArr[index] = batterHitArr[index] + 1;
					
					if( homeRunChance <= homeRunProArr[index] ) { // 홈런
						System.out.println(" 홈런입니다!");
						homeRunCountArr[index]++;
						batterBaseArr[index]++;
						for(int i=0; i<9; i++) { // 점수계산 후 베이스 초기화
							if(batterBaseArr[i] > 0) {
								score = score + 1;
								batterBaseArr[i] = 0;
							}
						}
						break;
					}
					
					System.out.println(" 안타입니다.");
					for(int i=0; i<9; i++) {
						if(batterBaseArr[i] > 0) { // 선행주자 +1루
							batterBaseArr[i]++;
						}
						if(batterBaseArr[i] == 4) { // 홈에 들어올시 score +1
							batterBaseArr[i] = 0;
							score = score + 1;
						}
					}
					batterBaseArr[index]++; // 타자 +1루
					break;
				} else if(pitcher <= 20) {
					System.out.print("스트라이크.");
					strike++;
				} else if(pitcher >= 50 && pitcher <= 60) {
					System.out.print("스트라이크.");
					strike++;
				} else if(pitcher >= 90) {
					System.out.print("스트라이크.");
					strike++;
				} else {
					System.out.print("볼.");
					ball++;
				}
				
				if(strike == 3) {
					System.out.println("\n스트라이크 3개, 아웃입니다.");
					batterOutArr[index] = batterOutArr[index] + 1;
					outCount++;
					break;
				}
				if(ball == 4) { // 볼4개 = 안타
					System.out.println("\n볼 4개, 안타입니다.");
					batterHitArr[index] = batterHitArr[index] + 1;
					batterBallArr[index] = batterBallArr[index] + 1;
					
					for(int i=0; i<9; i++) {
						if(batterBaseArr[i] > 0) {
							batterBaseArr[i]++;
						}
						if(batterBaseArr[i] == 4) {
							batterBaseArr[i] = 0;
							score = score + 1;
						}
					}
					batterBaseArr[index]++;
					break;
				}
			}
			
			index++;
			if(index > 8 ) { // 9번타자 이후 1번타자
				index = 0;
			}
			if(outCount == 3) { // 3아웃시 다음회차
				outCount = 0;
				turn++;
				for(int i=0; i<9; i++) { // 베이스 초기화
					batterBaseArr[i] = 0;
				}
			}
			if(turn > 3) { // 3회차 초과시 종료
				System.out.println("게임 종료.");
				System.out.println("최종 점수 : " + score);
				break;
			}
		}
		
	}

}
