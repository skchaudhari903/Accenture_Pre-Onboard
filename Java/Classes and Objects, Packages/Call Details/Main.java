import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Call obj=new Call();
        System.out.println("Enter the call details:");
        String data=sc.nextLine();
        
        obj.parseData(data);
        System.out.println("Call id:"+obj.getCallId());
        System.out.println("Called number:"+obj.getCalledNumber());
        System.out.println("Duration:"+obj.getDuration());
    }
}