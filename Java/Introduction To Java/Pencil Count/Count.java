import java.util.Scanner;

class Count{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the standard:");
        int std = scan.nextInt();
        
        if(std < 1 || std > 12)
            System.out.println("Invalid Standard");
        else
            System.out.println("Nila gets " +(std*(std+1)*(2*std+1))/6 +" pencils");
    }
}