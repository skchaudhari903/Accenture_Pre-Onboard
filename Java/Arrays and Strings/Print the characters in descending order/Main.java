import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String[] arr=input.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            if(i==0){
                System.out.print(arr[i]);
            }
            else if(arr[i].equals(arr[i-1])){
                continue;
            }
            else{
                System.out.print(arr[i]);
            }
        }
    }
}