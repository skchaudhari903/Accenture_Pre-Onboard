import java.util.Scanner;

class ReplaceDriver{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = scan.nextLine();
        System.out.println("Enter the character to be replaced");
        char from = scan.next(".").charAt(0);
        System.out.println("Enter the character to be replaced with");
        char to = scan.next(".").charAt(0);
        System.out.println("The modified string is " +replace(str, from, to));
    }
    public static String replace(String str, char from, char to){
        if(str.length() < 1)
            return str;
        else{
            char first = from == str.charAt(0) ? to : str.charAt(0);
            return first + replace(str.substring(1), from, to);
        }
    }
}