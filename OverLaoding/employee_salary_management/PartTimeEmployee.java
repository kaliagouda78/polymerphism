package employee_salary_management;

public class PartTimeEmployee extends Employee {
	protected double hourlyRate;
	  protected int hoursWorked;
	  protected PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	  } 
	  public boolean velidateHourRate(double hourlyRate) {
		  if(hourlyRate<0) {
			  return false;
		  }
		  else {
			  return true;
		  }
	  }
	  public boolean velidateHouseWorked(int hoursWorked) {
		  if(hoursWorked<0) {
			  return false;
		  }
		  else  return true;
	  }
	  public double calculateSalary() {
		  if(velidateHourRate(hourlyRate)&&velidateHouseWorked(hoursWorked)) {
			  return hourlyRate*hoursWorked;
		  }
		  else {
			  System.err.println("enter a velid number");
			  System.exit(0);
			  return 0;
		  }
	  }
	  
}
