package quiz;

public class SalaryMan {

	int salary;
	
	SalaryMan() {
		salary = 1000000;
	}
	
	SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		int AnnualGross = salary*12 + salary*5; 
		return AnnualGross;
	}
}
