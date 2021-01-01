import java.util.Scanner;

class CelsiusConversion{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		
        float cel = scan.nextFloat();
        System.out.println(String.format("%.1f", cel*(9f/5) + 32));
    }
}