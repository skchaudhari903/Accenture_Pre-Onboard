import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        if(arr_size <= 3){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int[] arr_int = new int[arr_size];
        int big_diff = 0;
        int small_index = 0;
        for(int i = 0; i < arr_size; i++)
            arr_int[i] = sc.nextInt();
            for(int j = 0; j < arr_size - 2; j++){
                if(Math.abs(arr_int[j] - arr_int[j+2]) > big_diff){
                    big_diff = Math.abs(arr_int[j] - arr_int[j+2]);
                    if(arr_int[j] <= arr_int[j+2])
                        small_index = j;
                    else
                        small_index = j + 2;
                }
            }
        System.out.println(small_index);
    }
}