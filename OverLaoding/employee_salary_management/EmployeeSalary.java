package employee_salary_management;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***Salary Calculation Menu***		\r\n"
				+ "		 1) FullTime Employees \r\n"				+ "		 2) PartTime Employees  ");
		int n=sc.nextInt();
		sc.nextLine();
		switch(n) {
		case 1-> {
			System.out.print("enter employee id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter employee name :");
			String name=sc.nextLine();
			System.out.print("Enter your salary :");
			double sal=sc.nextDouble();
			FullTimeEmployee emp1=new FullTimeEmployee(id, name, sal);
			double salary=emp1.calculateSalary();
			System.out.println("the salary is:"+salary);
		}
		case 2->{
			System.out.print("enter employee id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter employee name :");
			String name=sc.nextLine();
			System.out.print("Enter your rate :");
			double rate=sc.nextDouble();
			sc.nextLine();
			System.out.print("enter work hour :");
			int hour=sc.nextInt();
			
			PartTimeEmployee emp2=new PartTimeEmployee(id, name, rate, hour);
			double sal=emp2.calculateSalary();
			System.out.println("the salary is:"+sal);
		}
		}

	}

}
