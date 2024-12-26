package practice.practice28;

import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

//연습문제 2.
//
//
//다음과 같은 실행결과를 얻도록 코드를 완성하시오.
//[Hint] instanceof . 연산자를 사용해서 형변환한다
//
//[실행결과]
//춤을 춥니다.
//노래를 합니다.
//그림을 그립니다.
//
//메서드명 : action
//기능 주어진 객체의 메서드를 호출한다 : .
//DanceRobot , dance() , 인 경우 를 호출하고
//SingRobot , sing() , 인 경우 을 호출하고
//DrawRobot , draw() . 인 경우 를 호출한다
//반환타입 없음 :
//매개변수: Robot r 인스턴스 또는 Robot 의 자손 인스턴스

//basecode
class ExcerciseInstanceof {
	
	public static void main(String[] args) {
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]); // static (main) 에서는 static (action)만 호출 가능
		}
		
		System.out.println();
		for( Robot r : arr ) {
			if( r instanceof DanceRobot ) {
				DanceRobot d = (DanceRobot)r;
				d.dance();
			} else if ( r instanceof SingRobot ) {
				SingRobot s = (SingRobot)r;
				s.sing();
			} else if ( r instanceof DrawRobot ) {
				DrawRobot d2 = (DrawRobot)r;
				d2.draw();
			}
		}
		
		System.out.println();
		for( Robot r : arr ) {
			r.action();
		}
		
	} // main

	private static void action(Robot robot) {
		if(robot instanceof DanceRobot) {
			((DanceRobot)robot).dance();
		}
		if(robot instanceof SingRobot) {
			((SingRobot)robot).sing();
		}
		if(robot instanceof DrawRobot) {
			((DrawRobot)robot).draw();
		}
	}
	
}

class Robot {
	void action() {
		
	}
}

class DanceRobot extends Robot {
	void action () {
		dance();
	}
	
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void action () {
		sing();
	}
	
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void action () {
		draw();
	}
	
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}