package practice.practice16;

public class TV {
	
	String model;
	int year;
	int inch;
	
	TV(String model, int year, int inch) {
		this.model = model;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV", model, year, inch);
	}
	
}
