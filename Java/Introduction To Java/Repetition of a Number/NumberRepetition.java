import java.util.Scanner;

class NumberRepetition{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int num = scan.nextInt();
        System.out.println("Enter the key digit ");
        int key = scan.nextInt();
        
        int temp = num, count = 0;
        while(temp > 0){
            if(temp % 10 == key)
                count++;
            temp /= 10;
        }
        System.out.println(key + " appears " +count + " times in " +num);
    }
}