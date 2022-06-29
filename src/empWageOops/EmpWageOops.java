package empWageOops;

import java.util.Scanner;

public class EmpWageOops {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Emp_compute emp = new Emp_compute();
		while(true) {
			System.out.println("\n1.For computing whether the employee is absent or present\n2.For computing employee daily wage\n3.For computing employee monthly wage\n4.For computing employee wage till conditiion");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				emp.present_absent();
				break;
			case 2:
				emp.daily_wage();
				break;
			case 3:
				emp.monthly_wage();
				break;
			case 4:
				emp.wage_till_condition();
				break;
			}
		}
	}

}
