import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the associate id:");
        int ass_Id=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the associate name:");
        String name=sc.nextLine();
        
        System.out.println("Enter the number of days:");
        int days=sc.nextInt();
        
        Associate obj=new Associate();
        
        obj.setAssociateName(name);
        obj.trackAssociateStatus(days);
        
        System.out.println("The associate "+obj.getAssociateName()+" work status:"+obj.getWorkStatus());
        
    }
}