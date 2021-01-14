import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();
        String result = "";
        for(int v = 0; v < len; v++)
            if(!result.contains(String.valueOf(input.charAt(v))))
                result += String.valueOf(input.charAt(v));
        
        char[] input_char = result.toCharArray();
        char[] first_half, second_half;
        int length_of;

        if(input_char.length % 2 == 0){
            length_of = input_char.length / 2;           
            first_half = new char[input_char.length / 2];
            second_half = new char[input_char.length / 2];
            for(int i = 0; i < length_of; i++){
                first_half[i] = input_char[i];
                second_half[i] = input_char[i + length_of];
            }
        }

        else{
            length_of = input_char.length / 2;
            first_half = new char[length_of + 1];
            second_half = new char[length_of];
            for(int k = 0; k <= length_of; k++){
                first_half[k] = input_char[k];
                if(k != length_of)
                    second_half[k] = input_char[k + length_of + 1];
            }
        }
        Character[] first = new Character[first_half.length];
        for(int n = 0; n < first_half.length; n++)
            first[n] = first_half[n];
       
        Arrays.sort(first, Collections.reverseOrder());
        Arrays.sort(second_half);
        for(int l = 0; l < first_half.length; l++)
            System.out.print(first[l]);
        for(int m = 0; m < second_half.length; m++)
            System.out.print(second_half[m]);
    }
}