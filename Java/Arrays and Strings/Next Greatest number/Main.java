import java.util.Scanner;
import java.util.Arrays;

public class Main{
    
    static void swap(char ar[], int i, int j){
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    
    static void findNextGreatest(char ar[], int n){
        int i;
        for(i = n -1; i > 0; i--){
            if(ar[i] > ar[i-1])
                break;
        }
        if(i == 0){
            for(int j = 0; j < ar.length; j++)
                System.out.print(ar[j]);
        }
        else{
            int x = ar[i - 1], min = i;
            for(int k = i + 1; k < n; k++){
                if(ar[k] > x && ar[k] < ar[min])
                    min = k;
            }
            swap(ar, i-1, min);
            Arrays.sort(ar, i, n);
            for(int l = 0; l < ar.length; l++)
                System.out.print(ar[l]);
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char arr[] = input.toCharArray();
        findNextGreatest(arr, arr.length);
        
    }
}