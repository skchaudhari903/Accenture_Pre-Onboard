import java.util.*;
public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String input=sc.nextLine();
        
        String str[]=input.split(" ");
        
        int n1=str.length;
        
        String output=new String();
        for(int i=0;i<n1;i++){   
            for(int j=0;j<str[i].length();j++){
                if(j<=i){
                    output=output+str[i].charAt(j);
                    continue;
                }
                output=output+Character.toUpperCase(str[i].charAt(j));
            }
            output=output+" ";
        }
        System.out.println(output);
    }
}