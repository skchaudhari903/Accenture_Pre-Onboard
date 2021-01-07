import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int head = scan.nextInt();
        int leg = scan.nextInt();
        int cow = head, men = 0;
        if(leg > (head*4))
            System.out.println("Invalid Input");
        else if(leg == (head*4)){
            System.out.println("Number of Cows: " +head);
            System.out.println("Number of Men: 0");
        }
        else{
            while(cow > 0){
                if(leg < cow*4){
                    cow--;
                    leg -= 2;
                    men++;
                }
                else if(leg == cow*4)
                    break;
            }
            System.out.println("Number of Cows: "+cow);
            System.out.println("Number of Men: "+men);
        }
    }
}