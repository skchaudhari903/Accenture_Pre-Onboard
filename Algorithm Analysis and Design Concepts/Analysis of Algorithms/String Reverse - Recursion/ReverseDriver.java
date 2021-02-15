import java.util.Scanner;

class ReverseDriver{
    public static String reverseString(String str){
        if(str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        System.out.print("Reversed string is: " +reverseString(str));
    }
}