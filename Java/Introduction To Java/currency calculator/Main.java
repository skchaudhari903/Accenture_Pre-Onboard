import java.util.Scanner;
import java.text.DecimalFormat;

class Main{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        String countryCode[] = {"CAD", "HKD", "SGD", "USD"};
        String countryName[] = {"Canada", "Hong Kong", "Singapore", "USA"};
        double exgRate[] = {52.08, 8.86, 51.29, 69.55};
        int flag = 0;
        System.out.println("Enter the currency code");
        String cur = scan.nextLine().toUpperCase();
        for(int i = 0; i <= 3; i++){
            if(cur.equals(countryCode[i])){
                System.out.println("Enter the amount");
                int amt = scan.nextInt();
                double ans = amt * exgRate[i];
                DecimalFormat f = new DecimalFormat("########0.00");
                System.out.println(countryName[i] + " dollar " + amt + " equals to " + f.format(ans) + " Indian Rupee");
                flag++;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Currency code not found");
            
    }
}