package empWageOops;

public class Emp_compute {
	int emp_present = 1;
	double emp_check;
	public Emp_compute() {
		emp_check = Math.floor(Math.random() * 10) % 3+1;
	}
	public void present_absent() {
		System.out.println("welcome to employee wage computation");
		if (emp_check == emp_present) {
			System.out.println("The employee is present");

		} else if(emp_check==2) {
			System.out.println("the employee is absent");
		}
	}
	public void daily_wage() {
		int wage_per_hour = 20;
		int full_day_hour = 8;
		int part_time_hour = 4;
		if (emp_check == emp_present) {
			System.out.println("The wage is : " + wage_per_hour * full_day_hour);
		} else if (emp_check == 2) {
			System.out.println("the employee is absent so no wage");
		}
		else {
			System.out.println("The employee is part time");
			System.out.println("the employee wage is : " +wage_per_hour*part_time_hour);
		}
	}
}
