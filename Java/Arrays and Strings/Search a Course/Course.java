import java.util.*;

class Course{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of course: ");
        int number = scn.nextInt();
        if(number > 0 && number <= 20){
            String[] course = new String[number+1];
            System.out.println("Enter course names:");
            for(int i = 0;i <= number; i++)
                course[i] = scn.nextLine();
            System.out.println("Enter the course to be searched:");
            String searchitem = scn.nextLine();
            int count = 0;
            for(int i = 0;i <= number; i++){
                if(course[i].equals(searchitem)){
                    count++;
                    break;
                }
            }
            if(count == 1)
            System.out.println(searchitem + " course is available");
            else
            System.out.println(searchitem + " course is not available");
        }
        else
            System.out.println("Invalid Range");
    }
}                                                                               