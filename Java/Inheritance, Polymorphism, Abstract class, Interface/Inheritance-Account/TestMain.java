import java.util.*;

public class TestMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the AccountNumber: ");
        int an=sc.nextInt();
        System.out.println("Enter the Account Holder Name: ");
        String hn=sc.next();
        System.out.println("Enter the Account Balance: ");
        double ab=sc.nextDouble();
        System.out.println("Enter the Minimum Balance: ");
        float mb=sc.nextFloat();
        SavingsAccount sa=new SavingsAccount();
        sa.setAccntNo(an);
        sa.setAccntHolderName(hn);
        sa.setAccntBalance(ab);
        sa.setMinBalance(mb);
        System.out.println(sa.toString());
    }
}