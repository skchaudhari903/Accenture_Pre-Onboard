import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double num = scan.nextDouble();
        if(num == (int)(num))
            System.out.println("Input a decimal number");
        else
            fraction(num);
    }
    static void fraction(double x){
        String a = "" + x;
        String splits[] = a.split("\\.");
        int b = splits[1].length();
        int denominator = (int)Math.pow(10, b);
        int numerator = (int)(x*denominator);
        int gcd = getGCD(numerator, denominator);
        System.out.println("Fraction: " +"" + numerator/gcd + "/" + denominator/gcd);
    }
    static int getGCD(int n1, int n2){
        if(n2 == 0)
            return n1;
        return getGCD(n2, n1%n2);
    }
}