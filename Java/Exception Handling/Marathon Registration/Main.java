import java.util.*;

public class Main {
    static String name;
    static int age;
    static char gender;
    static long contact;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Marathon m=new Marathon();
		while(true){
    		System.out.println("Enter name: ");
    	    try{
    	        name=sc.next();
    	        if(!name.matches("^[a-zA-Z]*$")){
    	            throw new InputMismatchException();
    	        }
    	    }
    	    catch(InputMismatchException i){
    	        System.out.println("Invalid Input");
    	        break;
    	    }
    		System.out.println("Enter age: ");
    		try{
    		    age=sc.nextInt();
    		}
    		catch(InputMismatchException i){
    		    System.out.println("Invalid Input");
    		    break;
    		}
    		System.out.println("Enter Gender: ");
    	    try{
    	        gender=sc.next().charAt(0);
    	        if(!(gender=='m' || gender=='f' || gender=='M' || gender=='F')){
    	            throw new InputMismatchException();
    	        }
    	    }
    	    catch(InputMismatchException i){
    	        System.out.println("Invalid Input");
    	        break;
    	    }
    		System.out.println("Enter Contact no: ");
    		try{
    		    contact=sc.nextLong();
    		}
    		catch(InputMismatchException i){
    		    System.out.println("Invalid Input");
    		    break;
    		}
    		//Fill the code
    		m.setName(name);
    		m.setAge(age);
    		m.setGender(gender);
    		m.setContactNo(contact);
    		System.out.println("Registered Successfully");
    		break;
		}
	}
}