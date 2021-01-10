import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] certification;
        System.out.println("Enter the employee id:");
        String eid = sc.next();
        System.out.println("Enter the salary:");
        double sal = sc.nextDouble();
        System.out.println("Enter the no of certification complete:");
        int certi = sc.nextInt();
        certification = new String[certi];
        if(certi > 0){
            System.out.println("Enter the certification names:");
            for(int i = 0; i < certification.length; i++){
                certification[i] = sc.next();
            }
        }
        
        Employee e1 = new Employee(eid, sal, certification);
        System.out.println("Your rating is " + e1.getRating());
        System.out.println("Increment amount is " + String.format("%.2f", e1.calculateIncrement()));
        System.out.println("Current salary " + String.format("%.2f", e1.getSalary()));
    }
}