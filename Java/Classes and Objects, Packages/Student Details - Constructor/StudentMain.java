import java.util.Scanner;

public class StudentMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag;
        String cname = "";
        System.out.println("Enter Student's Id:");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Name:");
        String sname = sc.nextLine();
        System.out.println("Enter Student's address:");
        String sadd = sc.nextLine();
        while(true){
            System.out.println("Whether the student is from NIT(Yes/No):");
            String check = sc.nextLine();
            if(check.equalsIgnoreCase("yes")){
                flag = 1;
                break;
            }
            else{
                if(check.equalsIgnoreCase("no")){
                        flag=0;
                        System.out.println("Enter the college name:");
                        cname=sc.nextLine();
                        break;
                    }
                    else
                    System.out.println("Wrong input");
                }
            }
            if(flag == 1){
                Student s=new Student(sid,sname,sadd);
                System.out.println("Student id:"+s.getStudentId());
                System.out.println("Student name:"+s.getStudentName());
                System.out.println("Address:"+s.getStudentAddress());
                System.out.println("College name:"+s.getCollegeName());
            }
            else{
                Student s=new Student(sid,sname,sadd,cname);
                System.out.println("Student id:"+s.getStudentId());
                System.out.println("Student name:"+s.getStudentName());
                System.out.println("Address:"+s.getStudentAddress());
                System.out.println("College name:"+s.getCollegeName());
            }
        }
}