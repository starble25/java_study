package study.inherit.inherit03;

public class BluetoothMike extends Mike {

	boolean isConnect;
	
	//부모클래스 생성자 super();
	
	public void connect() {
	}
	
	public int volumeUp(String s) { // Overloading
		System.out.println("String 매개변수 있는 볼륨 업");
		return 0;
	}
	
	//재귀함수
	public void volumeUp() { // Overriding
		//super.volumeUp(); 부모 클래스 함수 호출 super.
		System.out.println("BluetoothMike 볼륨 업 재정의");
	}
	
	// 메소드 선언x -> 재정의(Overriding)
	public String toString() {
		String s = "나는 BluetoothMike 입니다.";
		return s;
	}
	
	// 부모클래스 Mike에 이미 정의됨
//	String type;
//	String model;
//	int price;
//	
//	public void check() {
//	}
//	
//	public void volumeUp() {
//	}
}
