import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] char_arr = input.toCharArray();
        int count, i = 0;
        boolean cons = false;
        while(i <= char_arr.length - 1){
            count = 1;
            System.out.print(char_arr[i]);
            if(i == char_arr.length - 1)
                break;
            while(char_arr[i] == char_arr[i+1]){
                count++;
                cons = true;
                i++;
                if(i == char_arr.length - 1)
                    break;
            }
            i++;
            if(cons == true)
                System.out.print(count);
        }
    }
}