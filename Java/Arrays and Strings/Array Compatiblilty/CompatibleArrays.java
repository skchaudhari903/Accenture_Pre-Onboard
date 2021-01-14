import java.util.*;

public class CompatibleArrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for First array:");
        int size1 = sc.nextInt();
        if(size1 > 0)
        {
            int[] arr1 = new int[size1];
            System.out.println("Enter the elements for First array:");
            for(int i = 0;i < size1; i++)
                arr1[i]=sc.nextInt();
            System.out.println("Enter the size for Second array:");
            int size2=sc.nextInt();
            if(size2 > 0){
                int count = 0;
                int[] arr2 = new int[size2];
                System.out.println("Enter the elements for Second array:");
                for(int i = 0;i < size2; i++)
                    arr2[i] = sc.nextInt();
                if(size1 == size2){
                    for(int i = 0; i < size1; i++){
                        if(arr1[i] < arr2[i])
                            count++;
                    }
                    if(count == 0)
                        System.out.println("Arrays are Compatible");
                    else
                        System.out.println("Arrays are Not Compatible");
                }
                else
                    System.out.println("Arrays are Not Compatible");
            }
            else
                System.out.println("Invalid array size");
        }
        else
            System.out.println("Invalid array size");
    }
}