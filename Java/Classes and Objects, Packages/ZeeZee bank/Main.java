import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("########0.00");
        System.out.println("Enter the account number:");
        long acc_num=sc.nextLong();
        
        System.out.println("Enter the available amount in the account:");
        double bal_amt=sc.nextDouble();
        
        System.out.println("Enter the amount to be deposited:");
        double dep_amt=sc.nextDouble();
        
        Account obj= new Account(acc_num, bal_amt);
        
        obj.deposit(dep_amt);
        System.out.println("Available balance is:"+df.format(obj.getBalanceAmount()));
        
        System.out.println("Enter the amount to be withdrawn:");
        double wdw_amt=sc.nextDouble();
        
        if(obj.withdraw(wdw_amt)==-1)
            System.out.println("Insufficient balance");
        
        System.out.println("Available balance is:"+df.format(obj.getBalanceAmount()));
    }
    
}