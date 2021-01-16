import java.util.*;

public class Main{
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("Gender");
        String gender=sc.nextLine();
        System.out.println("Expected Salary");
        double salary = sc.nextDouble();
        
        if(salary<10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        else{
            Candidate c=new Candidate();
            c.setName(name);
            c.setGender(gender);
            c.setExpectedSalary(salary);
            return c;
        }
    }
    public static void main(String[] args){
        try{
            Candidate c1=Main.getCandidateDetails();
            if(!c1.equals(null))
                System.out.println("Registration Successful");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}