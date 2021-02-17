import java.util.Scanner;

class Ticket{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of customer takes the tickets:");
        int num = scan.nextInt();
        if(num <= 0){
            System.out.println("Invalid number");
            System.exit(0);
        }
        else{
            int array[] = new int[num];
            System.out.println("The tickets in the system are:");
            for(int i = 0; i < num; i++){
                array[i] = i + 1;
                System.out.print(array[i] + " ");
            }
            System.out.println("\nEnter the number of tickets served:");
            int ser = scan.nextInt();
            if(ser <= num){
                System.out.println("The served tickets are:");
                for(int i = 0; i < ser; i++)
                    System.out.print(array[i] + " ");
            }
            else{
                System.out.println("Invalid Number");
                System.exit(0);
            }
            if(ser == num)
                System.out.println("\nNo more tickets to be served");
            else{
                System.out.println("\nThe unserved tickets are:");
                for(int i = ser; i <  num; i++)
                    System.out.print(array[i] + " ");
                
            }
        }
    }
}