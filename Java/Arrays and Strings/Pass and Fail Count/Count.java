import java.util.*;

class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int noofsub = sc.nextInt();
        int pass = 0,fail = 0;
        if(noofsub > 0 && noofsub <= 20){
            int[] submarks=new int[noofsub];
            for(int i = 0; i < noofsub; i++){
                submarks[i] = sc.nextInt();
                if(submarks[i] >= 50)
                    pass++;
                else
                    fail++;
            }
            if(pass == noofsub && fail == 0)
                System.out.println("Ram passed in all subjects");
            else if(pass == 0 && fail == noofsub)
                System.out.println("Ram failed in all subjects");
            else
                System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
        }
        else
            System.out.println("Invalid input range");
    }
}