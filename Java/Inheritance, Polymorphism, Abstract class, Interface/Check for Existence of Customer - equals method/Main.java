import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=s.next();
        System.out.println("Enter the panno:");
        String panno=s.next();
        System.out.println("Enter the emailid:");
        String emailid=s.next();
        System.out.println("Enter the salary:");
        int salary=s.nextInt();
        Customer cus1=new Customer(name,panno,emailid,salary);
        System.out.println("Enter the name:");
        name=s.next();
        System.out.println("Enter the panno:");
        panno=s.next();
        System.out.println("Enter the emailid:");
        emailid=s.next();
        System.out.println("Enter the salary:");
        salary=s.nextInt();
        Customer cus2=new Customer(name,panno,emailid,salary);
        if(cus1.equals(cus2))
            System.out.println("Both the objects are equal.");
        else
            System.out.println("Both the objects are not equal.");
    }
}