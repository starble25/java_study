package practice.practice16;

public class Rectangle {

	int width;
	int height;
	int rectangleArea;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		rectangleArea = width * height;
		return rectangleArea;
//		return width * height;
	}
}
