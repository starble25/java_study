package study.abst;

//추상클래스
public abstract class Beverage {
	String name;
	int ml;
	
	public void intro() {
		System.out.println("저는 음료입니다.");
	}
	
	//추상메소드
	public abstract void checkSafety();//안전검사
}
