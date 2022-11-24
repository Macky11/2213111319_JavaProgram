import javax.swing.*;
import java.text.*;
import java.util.Scanner;
public class PensionContributionCalculator {
	static final int SALARY_CEILING = 6000;
	static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
	static final double EMPLOYER_RATE_55_TO_60 = 0.13;
	static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	static final double EMPLOYER_RATE_60_TO_65 = 0.09;
	static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	static final double EMPLOYER_RATE_65_ABOVE = 0.075;
	public static void main(String[] args) {			
		int salary, age; 
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat(".00");
		System.out.print("Enter the monthly salary: $");
		salary = scan.nextInt();
		System.out.print("Enter the age: ");
		age =  scan.nextInt();
		if(age <= 55) {
			if(salary >6000) {
				employeeContribution = SALARY_CEILING * EMPLOYEE_RATE_55_AND_BELOW;
				employerContribution = SALARY_CEILING * EMPLOYER_RATE_55_AND_BELOW;
			}else {
				employeeContribution = (double) salary * EMPLOYEE_RATE_55_AND_BELOW;
				employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
			}
		}
		else if (age <= 60) {
			if(salary > 6000) {
				employeeContribution = SALARY_CEILING * EMPLOYEE_RATE_55_TO_60;
				employerContribution = SALARY_CEILING * EMPLOYER_RATE_55_TO_60;
			}else {
				employeeContribution = salary* EMPLOYEE_RATE_55_TO_60;
				employerContribution = salary* EMPLOYER_RATE_55_TO_60;
			}
		}
		else if (age <= 65) {
			if(salary > 6000) {
				employeeContribution = SALARY_CEILING * EMPLOYEE_RATE_60_TO_65;
				employerContribution = SALARY_CEILING * EMPLOYER_RATE_60_TO_65;
		}else {
			employeeContribution = salary* EMPLOYEE_RATE_60_TO_65;
			employerContribution = salary* EMPLOYER_RATE_60_TO_65;

	}
		}
		else {
			if(salary > 6000) {
				employeeContribution = SALARY_CEILING * EMPLOYEE_RATE_65_ABOVE;
				employerContribution = SALARY_CEILING * EMPLOYER_RATE_65_ABOVE;
		}else {
			employeeContribution = salary* EMPLOYEE_RATE_65_ABOVE;
			employerContribution = salary* EMPLOYER_RATE_65_ABOVE;
		}

}
		System.out.println(
				"The employee's contribution is: $"+frm.format(employeeContribution)
				+"\nThe employee's contribution is: $"+frm.format(employerContribution)
				+"\nThe total contribution is: $"+frm.format(employeeContribution+employerContribution)
				);
}
}
