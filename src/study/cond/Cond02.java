package study.cond;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice = 5;
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		}
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}
		
		
		// dice 1~6
		// dice 8
		
		if(dice == 1) {
		} else if (dice == 2) {
		} else if (dice == 3) {
		} else if (dice == 4) {
		} else if (dice == 5) {
		} else if (dice == 6) {
		} 
			// dice 1~6 일때만 실행
		
		if(dice == 1) {
		} else if (dice == 2) {
		} else if (dice == 3) {
		} else if (dice == 4) {
		} else if (dice == 5) {
		} else {
		}
			// dice 1~5가 아니면 else 실행
		
		
		System.out.println("=======switch=======");
		dice = 1;
		
		switch(dice) {
		case 1: 	//dice == 1
			System.out.println("case 1");
			System.out.println("case 1");
			System.out.println("case 1");
		case 2: 	//dice == 2
			System.out.println("case 2");
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
		case 5:
			System.out.println("case 5");
		case 6:
			System.out.println("case 6");
		default: 	// else
			System.out.println("default");
		}
		
		// 8시 출근 : 청소
		// 9시 출근 : 회의
		// 10시 : 업무
		// 11시 : 외근
		
		int showTime = 9;
		
		if( showTime <= 8 ) {
			// 청소
		}
		if( showTime <= 9 ) {
			// 회의
		}
		if( showTime <= 10 ) {
			// 업무
		}
		if( showTime <= 11 ) {
			// 외근
		}
		// 9, 10, 11 : 회의, 업무, 외근
		
		
		if( showTime <= 8 ) {
			// 청소
			// 회의
			// 업무
			// 외근
		} else if( showTime <= 9 ) {
			// 회의
			// 업무
			// 외근
		} else if( showTime <= 10 ) {
			// 업무
			// 외근
		} else if( showTime <= 11 ) {
			// 외근
		}		
		// 9 : 회의, 업무, 외근
		
		switch( showTime ) {
		case 8:
			//청소
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
		}
		// 9, 10, 11 : 회의, 업무, 외근
		
		int goBedTime = 21;
		int sleepTime = 9;
		
		if(goBedTime <= 21 ) {
			// 일찍 잤구나
			if(sleepTime >=9 ) {
				//많이 잤구나
			} else {
				//조금 잤구나
			}
			
		} else {
			// 늦게 잤구나
			if(sleepTime <=9 ) {
				//많이 잤구나
			} else {
				//조금 잤구나
			}
		}
		
	
		// x == 10		x != 10		!(x == 10)
		// x < 10		x >= 10		!(x < 10)
		
		
		if(goBedTime <= 21 && sleepTime >= 9) {
			
		} else if (goBedTime <= 21 && !(sleepTime >= 9)) {
//		} else if (goBedTime <= 21 && sleepTime < 9) {
			
		}
		
	}

}
