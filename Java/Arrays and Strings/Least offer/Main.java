import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        int no_input=sc.nextInt();
        sc.nextLine();
        String input[]=new String[no_input];
        String input1[][]=new String[no_input][3];
        
        for(int i=0;i<no_input;i++){
            input[i]=sc.nextLine();
            input1[i]=input[i].split(",");
        }
        
        int discount[]=new int[no_input];
        
        for(int i=0;i<no_input;i++){
            discount[i]=(Integer.parseInt(input1[i][2])*Integer.parseInt(input1[i][1]))/100;
        }
        
        int min_dis=32767;//highest value that can be stored in Integer
        String output=new String();
        
        for(int i=0;i<input.length;i++){
            if(min_dis>discount[i]){
                min_dis=discount[i];
            }
        }
        
        for(int i=0;i<input.length;i++){
            if(discount[i]==min_dis){
                output=output+input1[i][0]+" ";
            }
        }
        System.out.println(output);
    }
}