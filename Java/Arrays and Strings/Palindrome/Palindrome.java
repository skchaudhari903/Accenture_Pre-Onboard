import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = scn.nextLine();
        
        String originalinput = input;
        
        input = input.toLowerCase();
        
        char[] charArray = input.toCharArray();
        
        for(char c:charArray){
            if(!Character.isLetter(c)){
                System.out.println("Invalid Input");
                return;
            }
        }
        StringBuilder s = new StringBuilder();
        s.append(input);
        StringBuilder reversed = s.reverse();
        String rev = reversed.toString();
        if(rev.equals(input))
            System.out.println(originalinput+" is a Palindrome");
        else
            System.out.println(originalinput+" is not a Palindrome");
    }
}