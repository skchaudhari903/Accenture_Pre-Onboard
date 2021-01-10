import java.util.Scanner;

public class StudentMain{
    public static void main(String[] args){
        Student s = getStudentDetails();
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("Average:"+String.format("%.2f",s.getAverage()));
        System.out.println("Grade:"+s.getGrade());
    }
    public static Student getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the no of subjects:");
        int n = sc.nextInt();
        if(n <= 0){
            while(n <= 0){
                System.out.println("Invalid number of subject");
                System.out.println("Enter the no of subjects:");
                n=sc.nextInt();
            }
        }
        int arr[] = new int[n];
        for(int a = 0; a < n; a++){
            System.out.println("Entermark for subject "+(a+1)+":");
            int b=sc.nextInt();
            if(b < 0 || b > 100){
                System.out.println("Invalid Mark");
                System.out.println("Enter mark for subject "+(a+1)+":");
                b = sc.nextInt();
            }
            arr[a] = b;
        }
        Student obj = new Student(id,name,arr);
        obj.setId(id);
        obj.setName(name);
        return obj;
    }
}