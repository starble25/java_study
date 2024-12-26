package practice.practice28;

//연습문제 1. 
//
//아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit 이라는 클래스를 만들고 이 ,
//클래스를 상속받도록 코드를 변경하시오.
//*조건
//1) 멈추는 동작은 모두 동일하게 제자리에 정지한다.
//2) 움직이는 동작은 걷는거, 날기, 바퀴구르기 다르기 때문에 각각 다르게 정의한다.

public abstract class Unit { // Unit을 뽑은게 아니라 marine, tank...를 뽑음
	int x, y;
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("정지");
	};
	
	public static void main(String[] args) {
		Unit marine = new Marine();
		marine.move(1, 1);
		System.out.printf("이동 x:%d y:%d\n", marine.x, marine.y);
		marine.stop();
		((Marine)marine).stimPack();
		
		System.out.println();
		Unit tank = new Tank();
		tank.move(3, 4);
		System.out.printf("이동 x:%d y:%d\n", tank.x, tank.y);
		tank.stop();
		((Tank)tank).changeMode();
		
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Dropship d1 = new Dropship();
		
		Unit[] bd1 = {m1, m2, m3, d1};
		for(Unit u : bd1) {
			u.move(7, 7);
		}
	}
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void stimPack() {
		System.out.println("스팀팩 사용");
	}
	
}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void changeMode() {
		System.out.println("공격모드 변환");
	}
}

class Dropship extends Unit {
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void load() {
		System.out.println("선택 대상 태우기");
	}
	
	void unload() {
		System.out.println("선택 대상 내리기");
	}
}


//base code
//class Marine { // 보병
//int x, y; // 현재 위치
//void move(int x, int y) { /* */ } 지정된 위치로 이동
//void stop() { /* */ } 현재 위치에 정지
//void stimPack() { /* .*/} 스팀팩을 사용한다
//}
//class Tank { // 탱크
//int x, y; // 현재 위치
//void move(int x, int y) { /* */ } 지정된 위치로 이동
//void stop() { /* */ } 현재 위치에 정지
//void changeMode() { /* . */} 공격모드를 변환한다
//}
//class Dropship { // 수송선
//int x, y; // 현재 위치
//void move(int x, int y) { /* */ } 지정된 위치로 이동
//void stop() { /* */ } 현재 위치에 정지
//void load() { /* .*/ } 선택된 대상을 태운다
//void unload() { /* .*/ } 선택된 대상을 내린다
//}