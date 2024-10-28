package study.cls.cls02;

public class Car {
	
	// 필드
	String model;
	String color;
	int price;
	
	// 생성자
	 Car(){ // 객체 생성 후 초기에 해야할 일 / 필드의 초기화(필드변수애 저장할 값 세팅)
		 System.out.println("Car 생성자 호출됨");
		 color = "노랑";
	 }
	 
	 Car(String m) {
		 System.out.println("매개변수 생성자 호출");
		 model = m;
	 }
	 
	 // 매개변수는 타입만 인식
	 Car(String model, String color) {
		 this.model = model;
		 this.color = color;
	 }
	 
}
