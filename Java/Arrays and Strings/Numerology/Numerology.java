import java.util.*;
import java.util.regex.*;

public class Numerology{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z]*$");
        
        char[][] table = new char[][]{
            "12345678".toCharArray(),
            "ABCDEUOF".toCharArray(),
            "IKGMHVZP".toCharArray(),
            "JRLTNW-Z".toCharArray(),
            "Q-S-X---".toCharArray(),
            "Y-------".toCharArray()
        };
        
        System.out.println("Enter your name: ");
        String name = scn.nextLine();
        
        Matcher matcher = pattern.matcher(name);
        
        if(matcher.matches()){
            char[] nameArray = name.toCharArray();
            ArrayList<Integer> nums = new ArrayList<>();
        
            for(char ch : nameArray){
                for(int j = 1; j < 6; j++){
                    for(int k = 0 ;k < 8; k++){
                        if(ch == table[j][k])
                            nums.add(((int)table[0][k])-48);
                    }
                }
            }
            int sum = 0;
            for(int i = 0; i< nums.size();i++)
                sum += nums.get(i);
            System.out.println("Your numerology no is:"+(sum));
        }
        else
            System.out.println("Invalid name");
    }
}