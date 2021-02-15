import java.util.*;

class SortDriver{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String str = scan.next();
        char ch[] = str.toCharArray();
        int u = 0, j = 0, k = 0, l = 0, x = 0, y = 0, z = 0;
        for(int i = 0; i < ch.length; i++){
            if(Character.isUpperCase(ch[i])) u++;
            else l++;
        }
        char[] upper = new char[u];
        char[] lower = new char[l];
        for(int i = 0; i < ch.length; i++){
            if(Character.isUpperCase(ch[i])){
                upper[j] = ch[i];
                j++;
            }
            else{
                lower[k] = ch[i];
                k++;
            }
        }
        char[] arr = new char[upper.length + lower.length];
        Arrays.sort(upper);
        Arrays.sort(lower);
        while(x < upper.length && y < lower.length){
            arr[z++] = upper[x++];
            arr[z++] = lower[y++];
        }
        while(x < upper.length){
            arr[z++] = upper[x++];
        }
        while(y < lower.length){
            arr[z++] = lower[y++];
        }
        System.out.print("The Sorted String is: ");
        for(char c : arr)
            System.out.print(c);
    }
}