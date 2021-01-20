import java.util.*;

class Sum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scn.nextInt();
        
        if(size >= 1){
            System.out.println("Enter the elements:");
            int[] arr = new int[size]; 
        
            for(int i = 0; i < size; i++)
                arr[i] = scn.nextInt();
        
            Arrays.sort(arr);
            
            System.out.println(arr[size-1]+arr[0]);
        }
        else
            System.out.println("Invalid Array Size");
    }
}