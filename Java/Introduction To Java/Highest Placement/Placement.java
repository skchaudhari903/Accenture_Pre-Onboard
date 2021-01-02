import java.util.*;
class Placement{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        a=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        b=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if(a<0 || b<0 || c<0){
            System.out.println("Input is Invalid");
        }
        else if(b>a && b>c){
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        else if(c>a && c>b){
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
        else if(a==b && b==c && c==a){
            System.out.println("None of the department has got the highest placement");
        }
        else if(a==b){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(a==c){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else{
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
       
    }
}