import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 'E' for Electric Kettle and 'I' for Induction Stove( No other character will be accepted)");
        char op = scan.next().charAt(0);
        System.out.println("Enter the number of units ordered");
        int n = scan.nextInt();
        int total = 0;
        if(op == 'E'){
            if(n >= 21)
                total = n * 850;
            else if(n >= 11)
                total = n * 900;
            else
                total = n * 950;
        }
        else{
            if(n >= 26)
                total = n * 975;
            else if(n >= 16)
                total = n * 1000;
            else
                total = n * 1100;
        }
        System.out.println("Total amount to be paid is Rs." +total);
    }
}