import java.util.*;

public class Main {
    void zigzag(int[] arr){
        boolean flag=true;
        int temp=0;
        
        for(int i=0;i<(arr.length-1);i++){
            if(flag){
                if(arr[i]>arr[i+1]){
                 temp = arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag= !flag;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        int len=arr.length;
        
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        Main obj=new Main();
        obj.zigzag(arr);
    }
}