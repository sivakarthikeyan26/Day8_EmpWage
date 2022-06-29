package empWageOops;

public class Emp_compute {
	int emp_present = 1;
	double emp_check;
	public Emp_compute() {
		emp_check = Math.floor(Math.random() * 10) % 2;
	}
	public void present_absent() {
		System.out.println("welcome to employee wage computation");
		if (emp_check == emp_present) {
			System.out.println("The employee is present");

		} else {
			System.out.println("the employee is absent");
		}
	}
	public void daily_wage() {
		int wage_per_hour = 20;
		int full_day_hour = 8;
		System.out.println("welcome to employee wage computation");
		if (emp_check == emp_present) {
			System.out.println("The employee is present");
			System.out.println("The wage is : " + wage_per_hour * full_day_hour);
		} else {
			System.out.println("the employee is absent");
		}
	}
}
