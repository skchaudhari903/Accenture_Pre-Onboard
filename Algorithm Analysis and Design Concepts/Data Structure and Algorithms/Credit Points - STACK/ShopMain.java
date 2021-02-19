import java.util.Scanner;

class ShopMain{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the no. of users:");
        int num = scan.nextInt();
        if(num <= 0)
            System.out.println("Invalid no. of users");
        else{
            int array[] = new int[num];
            for(int i = 0; i < num; i++){
                System.out.println("Enter the credit points for user " +(i+1) +":");
                array[i] = scan.nextInt();
            }
            System.out.println("Enter the no. of users to serve:");
            int ser = scan.nextInt();
            if(ser <= 0 || ser > num){
                System.out.println("Invalid no. of users");
                System.exit(9);
            }
            if(num == ser)
                System.out.println("0 users to serve");
            else{
                System.out.println("The unserved user's credit points are:");
                for(int i = ser; i < num; i++)
                    System.out.print(" "+array[i]);
            }
        }
    }
}