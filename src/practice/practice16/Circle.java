package practice.practice16;

public class Circle {
	
	double radius;
	double circleArea;
	
	double getArea() {
//		double area = ...
		circleArea = radius * radius * 3.14;
		return circleArea;
//		return radius * radius * 3.14;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
