package employee_salary_management;

public class FullTimeEmployee extends Employee{
	protected double salary;


	protected FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
		if(salary<=0) {
			System.out.println("amount can't be negetive");
			System.exit(0);
		}
	}
	public double calculateSalary() {
			return salary;
		
	}
	
}
