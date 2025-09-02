package employee_salary_management;

public class Employee {
protected int id;
protected String name;
protected Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public double calculateSalary() {
	return 0.0;
}
public boolean velidateId(int id) {
	if(id>=1001 && id<10000) {
		return true;
	}
	else {
		System.out.println("your number should 4 digit");
		System.exit(0);
		return false;
	}
	

}
public boolean velidatename(String name) {
	if(name==null||name.isEmpty()||name=="null") {
		return false;
	}
	else {
		return true;
	}
}
}
