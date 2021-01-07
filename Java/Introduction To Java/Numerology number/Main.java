import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int temp = num, digit, sum = 0, even = 0, odd = 0, numerology = 0;
        String strNum = "";
        while(temp > 0){
            digit = temp % 10;
            strNum = (char)(digit + '0') + " " + strNum;
            sum += digit;
            if(digit % 2 == 0)
                even++;
            else
                odd++;
            temp /= 10;
        }
        numerology = sum;
        while(numerology > 9){
            numerology = numer(numerology);
        }
        System.out.println("The Numbers are: " +strNum);
        System.out.println("Sum of digits : " +sum);
        System.out.println("Numerology number: " +numerology);
        System.out.println("Number of odd numbers: " +odd);
        System.out.println("Number of even numbers: " +even);
    }
    static int numer(int a){
        int ans = 0, temp = a;
        while(temp > 0){
            ans += temp % 10;
            temp /= 10;
        }
        return ans;
    }
}