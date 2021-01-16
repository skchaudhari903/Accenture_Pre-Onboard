import java.util.*;
public class Main 
{
    public static void main (String[] args) {
        String test="zeezee.com";
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();//always give a blank nextLine if you are using string after int
        
        String email[][]=new String[n][2];
       
        for(int i=0;i<n;i++){
            email[i]=sc.next().split("@");
        }
        
        int flag=0;
        for(int i=0;i<n;i++){
            if((email[i][1]).equals(test)){
                flag++;
                continue;
            }
            else{
                System.out.println(email[i][0]+"@"+email[i][1]);
            }
        }
        if(flag==n){
            System.out.println("No personal mail id");
        }
    }
}