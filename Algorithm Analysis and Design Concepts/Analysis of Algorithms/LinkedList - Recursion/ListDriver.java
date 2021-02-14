//Without LL - Recursion

import java.util.Scanner;

class ListDriver{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        
        System.out.println("Enter the size of the list:");
        int size = scan.nextInt();
        if(size <= 0)
            System.out.println("Invalid Input");
        else{
            int[] array = new int[size];
            for(int i = 0; i < size; i++)
                array[i] = scan.nextInt();
            System.out.println("Printing the list:");
            for(int i = 0; i < size; i++)
                System.out.print(array[i] + " ");
            System.out.println("");
            System.out.println("Enter the key to find it's occurrence:");
            int key = scan.nextInt();
            for(int i = 0; i < size; i++){
                if(key == array[i])
                    count++;
            }
            System.out.println(key + " occurs for " +count + " times.");
        }
    }
}