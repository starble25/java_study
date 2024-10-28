package practice.practice16;

public class Person {
	
	String name;
	String gender;
	int age;
	double tall;
	double weight;
	String job;
	String bloodType;
	
	// boolean isHealthy;
	int healthState;
	//  10	9	8	7	...	1	0
	// 매우건강
	boolean isSleeping;
	
	Person(){}
	Person(String name, String gender, int age, double tall, double weight, String job, String bloodType, int healthState, boolean isSleeping) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.healthState = healthState;
		this.isSleeping = isSleeping;
	}
	
	void printPersonInfo() {
		System.out.printf("%s %s %d %.1f %.1f %s %s %d \n", name, gender, age, tall, weight, job, bloodType, healthState);
	}
	
}
