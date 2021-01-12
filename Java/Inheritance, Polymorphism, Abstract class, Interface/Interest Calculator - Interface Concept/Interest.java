import java.util.Scanner;

interface Percentage{
    float rateOfInterest=(float)10.5;
    public abstract double calculateInterest(double amount);
}

class InterestCalc implements Percentage{
    public double calculateInterest(double amount){
        return amount*this.rateOfInterest/100;
    }
}

public class Interest{	
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    Percentage i=new InterestCalc();
	    System.out.println("Enter the amount for which interest must be calculated");
	    double amount=sc.nextDouble();
	    System.out.println("The interest amount to be paid is");
	    System.out.println((int)(i.calculateInterest(amount)));
	    
	}
}	