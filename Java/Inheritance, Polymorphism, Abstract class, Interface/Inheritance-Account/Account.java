public class Account{
    private int accntNo;
    private String accntHolderName;
    private double accntBalance;
    public void setAccntNo(int accntNo){
        this.accntNo=accntNo;
    }
    public int getAccntNo(){
        return accntNo;
    }
    public void setAccntHolderName(String accntHolderName){
        this.accntHolderName=accntHolderName;
    }
    public String getAccntHolderName(){
        return accntHolderName;
    }
    public void setAccntBalance(double accntBalance){
        this.accntBalance=accntBalance;
    }
    public double getAccntBalance(){
        return accntBalance;
    }
}