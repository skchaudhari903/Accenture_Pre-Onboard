import java.util.*;

class ScoreCardDriver{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of the score card:");
        int size = scan.nextInt();
        if(size <= 0 || size > 100)
            System.out.println("Invalid score card size");
        else{
            Queue<Integer> que = new LinkedList<Integer>();
            for(int i = 0; i < size; i++){
                if(i >= 5)
                    que.remove();
                System.out.print("\nEnter the hurdle race score " +(i+1) + ":");
                que.add(scan.nextInt());
            }
            System.out.print("Latest hurdle race scores are: ");
            for(Integer element : que)
                System.out.print(element + " ");
        }
    }
}