import java.util.*;

class ArraySort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        if(n>0){
            Integer[] arr=new Integer[n];
            System.out.println("Enter the elements:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n%2!=0){
                Arrays.sort(arr,0,(n/2)+1);
                Arrays.sort(arr,(n/2)+1,n,Collections.reverseOrder());
            }
            else{
                Arrays.sort(arr,0,n/2);
                Arrays.sort(arr,n/2,n,Collections.reverseOrder());
            }
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
        else{
            System.out.println("Array size should be greater than 0");
        }
    }
}