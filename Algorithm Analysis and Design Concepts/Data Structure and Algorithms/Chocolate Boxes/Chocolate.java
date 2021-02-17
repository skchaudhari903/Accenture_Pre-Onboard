import java.util.Scanner;

class Chocolate{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the no. of boxes: ");
        int n = scan.nextInt();
        int flag = 0;
        System.out.println();
        if(n >=1 && n <= 10){
            int start = 0;
            int[] choc = new int[n];
            int temp = n;
            for(int i = 0; i < temp; i++){
                System.out.print("Enter the no. of chocolates in box " +(i+1) + ": ");
                choc[i] = scan.nextInt();
                System.out.println();
                if(i == 0){
                    if(choc[i] % 2 != 0){
                        System.out.println("Sorry!!! First box always should contain positive even no. of chocolates");
                        flag++;
                        break;
                    }
                }
                else{
                    if(choc[i] % 2 != 0)
                        start++;
                    
                }
            }
            if(flag != 1){
                System.out.print("No. of chocolates in each box: ");
                for(int i = start; i < n; i++)
                    System.out.print(choc[i] + " ");
            }
        }
        else
            System.out.println("Invalid input");
    }
}