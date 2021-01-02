import java.util.Scanner;

class LeapYear{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Year");
        int year = scan.nextInt();
        
        if(year >= 1000 && year < 10000){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        }
        else
            System.out.println("Invalid Year");
    }
}