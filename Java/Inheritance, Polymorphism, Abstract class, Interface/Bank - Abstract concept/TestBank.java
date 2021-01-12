public class TestBank{
    public static void main (String[] args) {
        Bank s=new SBI();
        Bank p=new PNB();
        System.out.println("Rate of Interest in SBI is: "+s.getRateOfInterest()+" %");
        System.out.println("Rate of Interest in PNB is: "+p.getRateOfInterest()+" %");
    }
}