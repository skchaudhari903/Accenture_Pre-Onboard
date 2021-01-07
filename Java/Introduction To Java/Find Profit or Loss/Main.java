import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int invest = 100000, amount = 0;
        System.out.println("Enter the profit percentage");
        int profitPercent = scan.nextInt();
        System.out.println("Enter the amount lost in Rs.");
        int lostAmount = scan.nextInt();
        int profitAmount = (profitPercent * invest) / 100;
        amount = (invest + profitAmount - lostAmount);
        if(amount > invest)
            System.out.println("After two years he gets a profit of " +((amount-invest)*100)/invest+"%.");
        else if(amount == invest)
            System.out.println("After two years he gets no loss or no gain,");
        else
            System.out.println("After two years he gets a loss of " +((invest-amount)*100)/invest+"%.");
    }
}