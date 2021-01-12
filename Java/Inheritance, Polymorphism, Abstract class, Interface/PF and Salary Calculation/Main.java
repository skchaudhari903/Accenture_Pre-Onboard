import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
            System.out.println("Enter the name:");
            String a1=s.nextLine();
            System.out.println("Enter the salary:");
            float b1=s.nextFloat();
            System.out.println("Enter the pfpercentage:");
            float c1=s.nextFloat();
            boolean d1=true;
            PermanentEmployee p1=new PermanentEmployee();
            //Employee p2=new Employee();
            p1.setName(a1);
            p1.setSalary(b1);
            p1.setPfpercentage(c1);
             d1=p1.validateInput();
            if (d1==false)
                System.out.println("Error!!! Unable to calculate the NetSalary.");
            else{
                p1.findNetSalary();
                System.out.println("Employee Name:"+p1.getName());
                System.out.println("PF Amount"+p1.getPfamount());
                System.out.println("NetSalary:"+p1.getNetsalary());
            }
    }
}