import java.util.Scanner;

public class Main{
    public static Ticket getTicketDetails(){
        Scanner sc = new Scanner(System.in);
        Ticket tc = new Ticket();
        System.out.println("Enter the ticketid:");
        tc.setTicketid(sc.nextInt());
        System.out.println("Enter the price:");
        tc.setPrice(sc.nextInt());
        return tc;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int booking = sc.nextInt();
        System.out.println("Enter the available tickets:");
        Ticket avail = new Ticket();
        avail.setAvailableTickets(sc.nextInt());
        for(int i = 0; i < booking; i++){
            Ticket t = new Ticket();
            t = getTicketDetails();
            System.out.println("Enter the no of tickets:");
            int nooftickets = sc.nextInt();
            System.out.println("Available ticket:"+t.getAvailableTickets());
            int cost = t.calculateTicketCost(nooftickets);
            if(cost != -1){
                System.out.println("Total amount:"+cost);
                System.out.println("Available ticket after booking:"+t.getAvailableTickets());
                System.out.println();
            }
        }
    }
}