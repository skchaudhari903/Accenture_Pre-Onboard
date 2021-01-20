import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        char vowels[]={'A', 'E', 'I', 'O', 'U'};
        //String vowels[]={"A", "E", "I", "O", "U"};
        String input[][]=new String[5][5];
        
        Scanner sc=new Scanner(System.in);
        String ip[]=new String[5];
        for(int i=0; i<5;i++){
            ip[i]=sc.nextLine();
            input[i]=ip[i].split(" ");
        }
        int vowel_count[][]=new int[5][5];
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0 ; j<5;j++){
                for(int k=0; k<5;k++){   
                    char temp=vowels[k];
                    for(int l=0; l<input[i][j].length(); l++){
                        if(temp==Character.toLowerCase(input[i][j].charAt(l)) || temp==Character.toUpperCase(input[i][j].charAt(l))){
                            count++;
                        }
                    }
                }
                vowel_count[i][j]=count;
                count=0;
            }
        }
        
        int score[] =new int[5];
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(vowel_count[i][j]==1 || vowel_count[i][j]==0){
                    System.out.print("0\t");
                    score[i]+=0;
                }
                else if(vowel_count[i][j]==2){   System.out.print("1\t");
                    score[i]+=1;
                }
                else if(vowel_count[i][j]==3){   
                    System.out.print("3\t");
                    score[i]+=3;
                }
                else if(vowel_count[i][j]==4){
                    System.out.print("4\t");
                    score[i]+=4;
                }
                else if(vowel_count[i][j]==5){   
                    System.out.print("6\t");
                    score[i]+=6;
                }
                else{   
                    System.out.print("8\t");
                    score[i]+=8;
                }
            }
            System.out.println();
        }
        
        
        int max=0;
        String max_index=new String();
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+"\t"+score[i]);
            if(score[i]>max && score[i]!=0)
            {
                max=score[i];
                max_index=max_index+"student "+String.valueOf(i+1)+" ";
            }
            else if(score[i]==max && score[i]!=0)
            {
                max_index=max_index+"student "+String.valueOf(i+1)+" ";
            }
            
        }
        
        if(max!=0)
        {   
            System.out.println("The winner is "+max_index+"with points "+max);
        }
        else
        {
            System.out.println("No one has got any points");
        }
    }
}