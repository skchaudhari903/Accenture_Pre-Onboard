import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        PhoneBook objmain=new PhoneBook();
        while(i==0){
            System.out.println("Menu\n1.Add contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit");
            System.out.println("Enter your choice: ");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1){
                Contact obj=new Contact();
                System.out.println("Add a contact:");
                System.out.println("Enter the First Name: ");
                obj.setFirstName(sc.nextLine());
                System.out.println("Enter the Last Name: ");
                obj.setLastName(sc.nextLine());
                System.out.println("Enter the Phone No.: ");
                obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
                System.out.println("Enter the Email: ");
                obj.setEmailId(sc.nextLine());
                objmain.addContact(obj);
            }
            if(n==2){
                System.out.println("The contacts in the List are:");
                List<Contact> obj=objmain.viewAllContacts();
                for(Contact temp:obj){
                    System.out.println("First Name:"+temp.getFirstName());
                    System.out.println("Last Name:"+temp.getLastName());
                    System.out.println("Phone No.:"+temp.getPhoneNumber());
                    System.out.println("Email:"+temp.getEmailId());
                }
            }
            if(n==3){
                System.out.println("Enter the Phone number to search contact:");
                Long n1=Long.parseLong(sc.nextLine());
                Contact obj1=objmain.viewContactGivenPhone(n1);
                System.out.println("The contact is:");
                System.out.println("First Name:"+obj1.getFirstName());
                System.out.println("Last Name:"+obj1.getLastName());
                System.out.println("Phone No.:"+obj1.getPhoneNumber());
                System.out.println("Email: "+obj1.getEmailId());
            }
            if(n==4){
                System.out.println("Enter the Phone number to remove :");
                Long n1=Long.parseLong(sc.nextLine());
                System.out.println("Do you want to remove the contact (Y/N):");
                char ch=sc.nextLine().charAt(0);
                if(ch=='Y'){
                    boolean f1=objmain.removeContact(n1);
                    if(f1)
                    System.out.println("The contact is successfully deleted");
                    else
                    System.out.println("Contact is not found");
                }
                if(ch=='N')
                    System.out.println("ok");
            }
            if(n==5)
                System.exit(0);
        }
    }
}