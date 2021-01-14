import java.util.*;

 public class Main{
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int []a = new int[n];
         int []left_sum = new int[n];
         int []right_sum = new int[n];
         int []output = new int[n];
         int i = 0, j = 0;
         for(i = 0; i < a.length; i++)
             a[i] = sc.nextInt();
         left_sum[0] = 0;
         right_sum[n-1] = 0;
         for(i = 1; i < n; i++)
             left_sum[i] = (a[i-1]*a[i-1])+left_sum[i-1];
         for(j = n-2; j >= 0; j--)
             right_sum[j]=(a[j+1]*a[j+1])+right_sum[j+1];
         for(i = 0; i < n; i++)
             output[i]=left_sum[i]+right_sum[i];
         for(i = 0; i < a.length; i++)
             System.out.println(output[i]);
     }
 }