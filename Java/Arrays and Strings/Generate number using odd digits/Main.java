import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        if(n>0){
            int arr[]=new int[n];
            System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
            String output="";
            
            for(int j=0;j<n;j++){
                if(arr[j]>=0&&arr[j]<10){
                    if(arr[j]%2!=0)
                        output=output.concat(String.valueOf(arr[j]));
                }
            }
            if(output.equals(""))
                System.out.println("Single digit odd number is not found in the array");
            else
            System.out.println(output);
        }
        else
            System.out.println("Invalid array size");
    }
}