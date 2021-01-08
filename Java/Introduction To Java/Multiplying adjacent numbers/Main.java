import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int first = scan.nextInt();
        if(first <= 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the second number:");
        int second = scan.nextInt();
        if(second <= 0 || first >= second){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the number of terms:");
        int num = scan.nextInt();
        if(num <= 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else{
            //int nexTerm = first * second;
            System.out.print(first + ", " +second);
            while(num > 0){
                int nextTerm = first * second;
                System.out.print(", " + nextTerm);
                first = second;
                second = nextTerm;
                num--;
            }
        }
    }
}