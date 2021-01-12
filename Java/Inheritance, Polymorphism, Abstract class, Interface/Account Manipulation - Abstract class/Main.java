import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cid=sc.nextInt();
        sc.nextLine();
        String cname=sc.nextLine();
        String cemail=sc.nextLine();
        Customer c=new Customer(cid,cname,cemail);
        int accNo=sc.nextInt();
        sc.nextLine();
        double balance=sc.nextDouble();
        sc.nextLine();
        double minbalance=sc.nextDouble();
        sc.nextLine();
        Account a=new SavingsAccount(accNo,c,balance,minbalance);
        double amount=sc.nextDouble();
        sc.nextLine();
        if(a.withdraw(amount)){
            System.out.println(a.getBalance());
        }
    }
}