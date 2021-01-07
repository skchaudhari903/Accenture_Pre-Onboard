import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        if(num1 > 0){
            int num2 = scan.nextInt();
            if(num2 > 0){
                int k = reverse(num1+num2);
                if(k == num1 * num2)
                    System.out.println("You are Lucky! Here Is your Gift.");
                else
                    System.out.println("Better Luck Next Time");
            }
            else
                System.out.println("Invalid Input");
        }
        else
            System.out.println("Invalid Input");
    }
    static int reverse(int num){
        int rev = 0; 
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}