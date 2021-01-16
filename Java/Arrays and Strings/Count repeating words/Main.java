import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        
        int len=str.length;
        int flag=0;
        for(int i=0;i<len;i++){
            for(int j=(i+1);j<len;j++){
                if((str[j]).equals(str[i])){
                    System.out.println(str[j]);
                    flag++;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("No repetition of words");
        }
    }
}