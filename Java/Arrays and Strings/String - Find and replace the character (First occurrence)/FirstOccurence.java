import java.util.Scanner;

class FirstOccurence{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        char[] str = scan.nextLine().toCharArray();
        System.out.println("Enter the character to be searched:");
        char key = scan.next().charAt(0);
        System.out.println("Enter the character to replace:");
        char newChar = scan.next().charAt(0);
        
        int flag = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == key){
                str[i] = newChar;
                flag++;
                break;
            }
        }
        if(flag == 0)
            System.out.println("character not found");
        else
            System.out.println(String.valueOf(str));
            
    }
}