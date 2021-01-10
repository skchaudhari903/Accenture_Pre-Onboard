public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    public int getTicketid(){
        return ticketid;
    }
    public int getPrice(){
        return price;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public void setTicketid(int id){
        ticketid = id;
    }
    public void setPrice(int p){
        price = p;
    }
    public static void setAvailableTickets(int t){
        if(t > 0)
            availableTickets=t;
    }
    public int calculateTicketCost(int nooftickets){
        int available=getAvailableTickets();
        if(available>nooftickets){
            setAvailableTickets(getAvailableTickets()-nooftickets);
            return (nooftickets*getPrice());
        }
        else
            return -1;
    }
}