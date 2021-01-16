import java.util.*;

public class ArrayException{
    public String getPriceDetails(){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the number of elements in the array");
            int size = scan.nextInt();
            int array[] = new int[size];
            System.out.println("Enter the price details");
            for(int i = 0; i < size; i++)
                array[i] = scan.nextInt();
            System.out.println("Enter the index of the array element you want to access");
            int index = scan.nextInt();
            return "The array element is " +array[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }
        catch(InputMismatchException e){
            return "Input was not in the correct format";
        }
    }
    public static void main(String[] args){
        ArrayException obj = new ArrayException();
        System.out.println(obj.getPriceDetails());
    }
}