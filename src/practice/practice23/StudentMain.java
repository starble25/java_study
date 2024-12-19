package practice.practice23;

public class StudentMain {

	public static void main(String[] args) {
		//1. 
//		다음을 만족하는 Student 클래스를 작성하시오.
//		· String 형의 학과와 정수형의 학번을 필드로 선언
//		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//		학과와 학번 필드에 적당한 값을 입력 후 출력
//		기능 추가.
//		· 필드를 모두 private 로 하고, getter 와 setter 를 구현하고
//		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//		setter 를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력

		Student s1 = new Student();
		s1.setDepartment("컴퓨터공학");
		s1.setStuNum(1001);
		s1.printInfo();
		
		System.out.printf("학과:%s 학번:%d", s1.getDepartment(), s1.getStuNum());
	}

}

class Student {

	private String department;
	private int stuNum;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	public void printInfo() {
		System.out.printf("학과:%s 학번:%d\n", this.department, this.stuNum);
	}
	
}