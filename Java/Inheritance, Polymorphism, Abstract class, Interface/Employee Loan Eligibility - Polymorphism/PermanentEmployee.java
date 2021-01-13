//Make this class inherit the Employee class

public class PermanentEmployee extends Employee
{
    private double basicPay;
    
    // Getters and Setters
	
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
    
    //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  
    
    public PermanentEmployee(int employeeId,String employeeName,double basicpay){
        super(employeeId,employeeName);
        //this.employeeId=employeeId;
        //this.employeeName=employeeName;
        this.basicPay=basicpay;
    }
    
	
	//2. Implement the  - public void calculateSalary() - method   
    
    public void calculateSalary(){
        double PFamount=0;
        PFamount=(basicPay*0.12);
        setSalary(basicPay-PFamount);
        
    }
    
}