//Make this class inherit the Employee class

public class TemporaryEmployee extends Employee {
	
	private int  hoursWorked;
	private int hourlyWages;
	
	// Getters and Setters
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	//1. Write a public 4 argument constructor with arguments – employeeId, employeeName, hoursWorked and hourlyWages.  
	
	
	public TemporaryEmployee(int a,String b,int c,int d){
	    //this.employeeId=a;
	    //this.employeeName=b;
	    super(a,b);
	    this.hoursWorked=c;
	    this.hourlyWages=d;
	}
	
	//2. Implement the  - public void calculateSalary() - method  
	
	public void calculateSalary(){
	    setSalary(hoursWorked*hourlyWages);
	    
	}
	
}