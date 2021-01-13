import java.util.Scanner;

public class Main{
    public static Hosteller getHostellerDetails(){
        Hosteller h1=new Hosteller();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int a1=s.nextInt();
        System.out.println("Student Name");
        s.nextLine();
        String b1=s.nextLine();
        System.out.println("Department Id");
        int c1=s.nextInt();
        System.out.println("Gender");
        s.nextLine();
        String d1=s.nextLine();
        System.out.println("Phone Number");
        String e1=s.nextLine();
        System.out.println("Hostel Name");
        String f1=s.nextLine();
        System.out.println("Room Number");
        int g1=s.nextInt();
        h1.setStudentId(a1);
        h1.setName(b1);
        h1.setDepartmentId(c1);
        h1.setGender(d1);
        h1.setPhone(e1);
        h1.setHostelName(f1);
        h1.setRoomNumber(g1);
        System.out.println("Modify Room Number(Y/N)");
        char i=s.next().charAt(0);
        if(i=='Y')
        {
            System.out.println("New Room Number");
            int x1=s.nextInt();
            h1.setRoomNumber(x1);
        }
        System.out.println("Modify Phone Number(Y/N)");
        char j=s.next().charAt(0);
        if(j=='Y')
        {
            System.out.println("New Phone Number");
            s.nextLine();
            String y1=s.nextLine();
            h1.setPhone(y1);
        }
        return h1;
    }
    public static void main(String args[]){
        Hosteller h2=new Hosteller();
        h2=getHostellerDetails();
        System.out.println("The Student Details:");
        System.out.println(h2.getStudentId()+" "+h2.getName()+" "+h2.getDepartmentId()+" "+h2.getGender()+" "+h2.getPhone()+" "+h2.getHostelName()+" "+h2.getRoomNumber());
    }
}