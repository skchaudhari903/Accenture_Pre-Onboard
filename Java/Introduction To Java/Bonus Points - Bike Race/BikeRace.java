import java.util.Scanner;

class BikeRace{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the distance travelled");
        int dist = scan.nextInt();
        
        if(dist < 0)
            System.out.println("Invalid Input");
        else if(dist == 0)
            System.out.println("Your bonus points is 0");
        else{
            int digit, even = 1, odd = 1;
            while(dist > 0){
                digit = dist % 10;
                odd *= digit;
                dist /= 10;
                
                if(dist == 0)   
                    break;
                digit = dist % 10;
                even *= digit;
                dist /= 10;
            }
            if(even == odd)
                System.out.println("Your bonus points is " +(2*even));
            else if(even > odd)
                System.out.println("Your bonus points is " +even);
            else
                System.out.println("Your bonus points is "+odd);
        }
    }
}