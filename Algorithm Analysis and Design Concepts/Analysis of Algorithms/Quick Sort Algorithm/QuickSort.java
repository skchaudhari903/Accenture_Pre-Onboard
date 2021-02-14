import java.util.Scanner;

class Sort{
    public static void quickSort(int[] ar, int start, int end){
        if(start < end){
            int pi = partition(ar, start, end);
            quickSort(ar, start, pi-1);
            quickSort(ar, pi+1, end);
        }
    }
    public static int partition(int[] ar, int start, int end){
        int pivot = ar[end];
        int i = (start-1);
        for(int j = start; j < end; j++){
            if(ar[j] <= pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        int temp = ar[i+1];
        ar[i+1] = ar[end];
        ar[end] = temp;
        return i+1;
    }
}
class QuickSort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many elements?");
        int n = scan.nextInt();
        if(n <= 0)
            System.out.println("Invalid Input");
        else{
            int array[] = new int[n];
            System.out.print("Enter array elements:");
            for(int i = 0; i < n; i++)
                array[i] = scan.nextInt();
            Sort.quickSort(array, 0, n-1);
            System.out.print("Array after sorting:");
            for(int element : array)
                System.out.print(element + " ");
        }
    }
}