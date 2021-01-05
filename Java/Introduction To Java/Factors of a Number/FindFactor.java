import java.util.Scanner;
import java.lang.Math;

class FindFactor{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        num = Math.abs(num);
        
        if(num == 0)
            System.out.println("No Factors");
        else{
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    System.out.print(i);
                    if(num == i)
                        System.out.print("");
                    else
                        System.out.print(", ");
                }
            }
        }
    }
}