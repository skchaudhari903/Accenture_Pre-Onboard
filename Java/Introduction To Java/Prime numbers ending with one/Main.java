import java.util.Scanner;

class Main{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        int flag = 0, k = 0, z = 0;
        System.out.println("Enter the first number");
        int first = scan.nextInt();
        System.out.println("Enter the last number");
        int last = scan.nextInt();
        for(int i = first; i <= last; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0)
                    flag++;
            }
            if(i == last && (flag != 0 || i % 10 != 1)){
                while(z == 0){
                    for(int a = 2; a < i; a++){
                        if(i % a == 0)
                            flag++;
                    }
                    if(i % 10 == 1 && flag == 0){
                        System.out.print("," +i);
                        z++;
                    }
                    flag = 0;
                    i++;
                }
            }
            if(i % 10 == 1 && flag == 0){
                if(k == 0){
                    System.out.print(i);
                    k++;
                }
                else
                    System.out.print("," +i);
            }
            flag = 0;
        }
    }
}