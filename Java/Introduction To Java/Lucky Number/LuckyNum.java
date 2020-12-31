import java.util.Scanner;

class LuckyNum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Enter the car no:");
        int num = scan.nextInt();
        if(num < 1000)
            System.out.println(num + " is not a valid car number");
        else{
			int digit, sum = 0;
            while(num > 0){
                digit = num % 10;
                sum += digit;
                num /= 10;
            }
            if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)
                System.out.println("Lucky Number");
            else
                System.out.println("Sorry its not my lucky number");
        }
    }
}