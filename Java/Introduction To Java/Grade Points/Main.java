import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the grade point: ");
        double grade = scan.nextDouble();
        if(grade == 5)
            System.out.println("Grade: O");
        else if(grade >= 4.5)
            System.out.println("Grade: A");
        else if(grade >= 4.0)
            System.out.println("Grade: B");
        else if(grade >= 3.0)
            System.out.println("Grade: C");
        else if(grade >= 2.0)
            System.out.println("Grade: D");
        else if(grade >= 1.0)
            System.out.println("Grade: E");
        else
            System.out.println("Grade: F");
    }
}