public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loan=0;
	if(employeeObj instanceof PermanentEmployee)
	    {
	        loan=0.15*(employeeObj.getSalary());
	        return loan;
	    }
	    else
	    {
	        loan=0.1*(employeeObj.getSalary());
	        return loan;
	    }
	}

}