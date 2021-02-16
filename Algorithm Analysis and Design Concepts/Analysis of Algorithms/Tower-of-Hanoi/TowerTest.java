import java.util.Scanner;

class TowerTest{
    static void towerOfHanoi(int n, char from_rod, char to_road, char aux_road){
        if(n == 1){
            System.out.println("Move disk 1 from peg " +from_rod + " to peg " +to_road);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_road, to_road);
        System.out.println("Move disk " +n + " from peg " +from_rod + " to peg " +to_road);
        towerOfHanoi(n-1, aux_road, to_road, from_rod);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of disks :");
        int disk = scan.nextInt();
        if(disk < 0 || disk > 6)
            System.out.println("Invalid Input");
        else{
            System.out.println("The sequence of moves involved in the Tower of Hanoi are :");
            towerOfHanoi(disk, 'A', 'C', 'B');
        }
    }
}