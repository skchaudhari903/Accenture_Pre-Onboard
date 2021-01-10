public class Account{
    private long accountNumber;
    private double balanceAmount;
    
    public Account(long accountNumber, double balanceAmount){
        this.accountNumber=accountNumber;
        this.balanceAmount=balanceAmount;
    }
    
    public int withdraw(double amount){
        if((this.balanceAmount-amount)>0){   
            this.balanceAmount-=amount;
            return 1;
        }
        else{
            return -1;
        }
    }
    
    public void deposit(double amount){
        this.balanceAmount+=amount;
    }
    
    public double getBalanceAmount(){
        return this.balanceAmount;
    }
    
}