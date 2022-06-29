package empWageOops;

public class Emp_compute {
	int emp_present = 1;
	int wage_per_hour = 20;
	int full_day_hour = 8;
	int part_time_hour = 4;
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
		if (emp_check == emp_present) {
			System.out.println("The wage for a day is : " + wage_per_hour * full_day_hour);
		} else if (emp_check == 2) {
			System.out.println("the employee is absent so no wage");
		}
		else {
			System.out.println("The employee is part time");
			System.out.println("the employee wage per day is : " +wage_per_hour*part_time_hour);
		}
	}
	public void monthly_wage() {
		int month = 20;
		switch ((int)emp_check) {
		case 1:
			System.out.println("The wage for the month is : " + wage_per_hour * full_day_hour * month);
			break;
		case 3:
			System.out.println("The wage for the month is : " + wage_per_hour * part_time_hour * month);
			break;
		case 2:
			System.out.println("the employee is absent no wage");
		}
	}
}
