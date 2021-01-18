import java.util.*;

public class StudentMain{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter the id:");
        obj.setId(scn.nextInt());
        System.out.println("Enter the noof subjects:");
        int n=scn.nextInt();
        int arr[] = new int[n];
        for(int a = 0;a < n; a++){
            System.out.println("Enter the mark for subject "+(a+1)+ ":");
            arr[a] = scn.nextInt();
        }
        System.out.println("Id: "+obj.getId());
        System.out.println("Name: "+obj.getName());
        obj.setMarks(arr);
        obj.calculateAvg();
        obj.findGrade();
        System.out.println("Average: "+obj.getAverage());
        System.out.println("Grade: "+obj.getGrade());
    }
}