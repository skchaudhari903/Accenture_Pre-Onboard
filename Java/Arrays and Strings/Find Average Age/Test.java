import java.util.*;

class Test{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total no. of employees: ");
        int noofemployees = scn.nextInt();
        
        if(noofemployees > 1){
            double temp = 0.0; 
            int i = 0,avarage = 0,count=0;
            int[] arr = new int[noofemployees];
    
            System.out.println("Enter the age for "+noofemployees+" employees:");
            for(i = 0; i < noofemployees; i++){
                arr[i] = scn.nextInt();
                
                if(arr[i] >= 28 && arr[i] <= 40)
                    temp = temp + arr[i];    
                else if(arr[i] < 28 || arr[i] > 40){
                    count++;
                    break;
                }
            }
            if(count != 1){
                temp = temp / noofemployees;
                System.out.println("The average age is "+String.format("%.02f",temp));
            }
            else
               System.out.println("Invalid age encountered!"); 
        }
        else
           System.out.println("Please enter a valid employee count"); 
    }
}