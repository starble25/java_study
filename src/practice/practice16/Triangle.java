package practice.practice16;

public class Triangle {
	
	double width;
	double height;
	double triangleArea;
	
	void setSize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		triangleArea = (width * height) / 2;
		return triangleArea;
//		return (double)width * height / 2;
	}
}
