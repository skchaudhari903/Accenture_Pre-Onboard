import java.util.Scanner;

class Main{
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1 > 99 || num1 < 10 || num2 > 99 || num2 < 10)
            System.out.println("No");
        int revNum1 = reverse(num1);
        int revNum2 = reverse(num2);
        if(num1 * num2 == revNum1 * revNum2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static int reverse(int num){
        int rnum = 0;
        while(num > 0){
            int digit = num % 10;
            rnum = rnum * 10 + digit;
            num /= 10;
        }
        return rnum;
    }
}