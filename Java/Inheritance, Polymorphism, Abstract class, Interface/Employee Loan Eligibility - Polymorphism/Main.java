import java.util.Scanner;

public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();//employeeid
       String b=sc.nextLine();//employeename
       double c=sc.nextDouble();//salary
       double d=sc.nextDouble();//basic pay
       int e=sc.nextInt();//hoursworked
       int f=sc.nextInt();//hourswages
       Employee e1=new PermanentEmployee(a,b,d);
       e1.calculateSalary();
       Employee e2=new TemporaryEmployee(a,b,e,f);
       e2.calculateSalary();
       Loan l=new Loan();
       l.calculateLoanAmount(e1);
       l.calculateLoanAmount(e2);
    }
}