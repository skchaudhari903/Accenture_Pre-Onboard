import java.util.Scanner;
class SnacksDetails{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        
		System.out.println("Enter the no of pizzas bought:");
        int pi = scan.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puff = scan.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int co = scan.nextInt();
        
        int total = (100*pi) + (20*puff) + (10*co);
        
		System.out.println("Bill Details");
        System.out.println("No of pizzas:" +pi);
        System.out.println("No of puffs:" +puff);
        System.out.println("No of cooldrinks:" +co);
        System.out.println("Total price=" +total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}