import java.util.Scanner;

public class TestMain{
    public static Student createStudent(){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter the Departmant id:");
        int did = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Departmant name:");
        String dname = sc.nextLine();
        Department d=new Department();
        d.setDid(did);
        d.setDname(dname);
        s.setDepartment(d);
        System.out.println("Enter the student id:");
        s.setSid(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the Student name:");
        s.setSname(sc.nextLine());
        return s;
    }
    public static void main(String[] args){
        Student st = new Student();
        st=createStudent();
        st.getDepartment();
        System.out.println("Student id:"+st.getSid());
        System.out.println("Student name:"+st.getSname());
    }
}