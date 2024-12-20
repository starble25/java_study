package practice.practice25;

//basecode
public class ProtectedFields {
	public static void main(String[] args) {
//객체 생성
		Basketball b = new Basketball();
		Soccer s = new Soccer();
		PingPong p = new PingPong();

//객체 필드 초기화
		b.name = "농구";
		s.name = "축구";
		p.name = "탁구";

//부모 타입(업 캐스팅)으로 배열 생성
		Sports[] sportsArr = { b, s, p };

//모든 운동 설명 출력
		for (int i = 0; i < sportsArr.length; i++) {
			Sports tmp = sportsArr[i];
			tmp.description();
		}
	}
}

//운동
class Sports {
	/* 1. 상속 관계 및 동일 패키지내에서 해당 필드를 자유로이 쓰게 하세요. */
	protected String name;

	public void description() {
		System.out.printf("[%s]는 여가/경기/체력 단련 등을 위한 신체 운동입니다.\n", name);
	}
}

//농구
class Basketball extends Sports {
	/* 2. 메소드 오버라이딩(재정의)을 통해 농구을 설명해주세요. */
	public void description() {
		System.out.printf("[%s]는 손으로 공을 던져 골을 넣는 운동이다.\n", name);
	}
}

//축구
class Soccer extends Sports {
	/* 3. 메소드 오버라이딩(재정의)을 통해 축구을 설명해주세요. */
	public void description() {
		System.out.printf("[%s]는 주로 발로 공을 차 넣는 운동이다.\n", name);
	}
}

//탁구
class PingPong extends Sports {
	/* 4. 메소드 오버라이딩(재정의)을 통해 탁구을 설명해주세요. */
	public void description() {
		System.out.printf("[%s]는 공을 번갈아가며 주고받는 운동이다.\n", name);
	}
}