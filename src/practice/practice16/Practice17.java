package practice.practice16;

public class Practice17 {

	public static void main(String[] args) {
		/*
		사람 클래스

		이름
		성별
		나이
		키
		몸무게
		직업
		혈액형
		건강상태
		수면중여부
		 */
		
		Person p1 = new Person();
		p1.name = "나사람";
		p1.gender = "남";
		p1.age = 35;
		p1.tall = 188.8;
		// ...
		System.out.println(p1.name + p1.gender);
		
		Person p2 = new Person("이름", "여", 31, 167, 66.6, "학생", "O", 10, false);
		p2.printPersonInfo();
	}

}
