abstract public class Employee
{
	protected int employeeId;
    protected String employeeName;
    protected double salary;
    
    //Getters and Setters
  	public int getEmployeeId() {
  		return employeeId;
  	}
  	public void setEmployeeId(int employeeId) {
  		this.employeeId = employeeId;
  	}
  	public String getEmployeeName() {
  		return employeeName;
  	}
  	public void setEmployeeName(String employeeName) {
  		this.employeeName = employeeName;
  	}
  	public double getSalary() {
  		return salary;
  	}
  	public void setSalary(double salary) {
  		this.salary = salary;
  	}
  	
    //Write a public 2 argument constructor with arguments – employeeId,and employeeName
    public Employee(int employeeId,String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    
    //Write a method -  public void calculateSalary()
	//Make this method as abstract
	abstract public void calculateSalary();
}