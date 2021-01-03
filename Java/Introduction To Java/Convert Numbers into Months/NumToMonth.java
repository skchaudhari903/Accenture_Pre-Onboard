import java.util.Scanner;

class NumToMonth{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        int n = scan.nextInt();
        if(n >= 1 && n <= 12){
            System.out.println(months[n-1]);
        }
        else
            System.out.println("No month for the number " +n);
    }
}