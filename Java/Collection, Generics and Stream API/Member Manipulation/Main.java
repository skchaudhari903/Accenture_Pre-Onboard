import java.util.*;

public class Main{
    public static void main(String args[]){
        Library o=new Library();
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i==0){
            System.out.println("1.Add Member\n2.View All Members\n3.Search Member by address\n4.Exit");
            System.out.println("Enter your choice");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1){
                Member obj=new Member();
                System.out.println("Enter the id:");
                obj.setMemberId(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter the name:");
                obj.setMemberName(sc.nextLine());
                System.out.println("Enter the address:");
                o.addMember(obj);
            }
            if(n==2){
                List<Member> obj1=o.viewAllMembers();
                for(Member o1:obj1){
                    System.out.println("Id:"+o1.getMemberId());
                    System.out.println("Name:"+o1.getMemberName());
                    System.out.println("Address:"+o1.getAddress());
                }
            }
            if(n==3){
                System.out.println("Enter the address:");
                List<Member>
                obj=o.viewMembersByAddress(sc.nextLine());
                for(Member obj1:obj){
                    System.out.println("Id:"+obj1.getMemberId());
                    System.out.println("Name:"+obj1.getMemberName());
                    System.out.println("Address:"+obj1.getAddress());
                }
            }
            if(n==4){
                System.exit(0);
            }
        }
    }
}