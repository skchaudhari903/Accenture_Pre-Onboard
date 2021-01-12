public class SavingsAccount extends Account{
    private float minBalance;
    public void setMinBalance(float minBalance){
        this.minBalance=minBalance;
    }
    public float getMinBalance(){
        return minBalance;
    }
    @Override
    public String toString(){
        String str="AccountNo:"+String.valueOf(getAccntNo())+"-AccountHolderName:"+getAccntHolderName()+"-AccountBalance:"
        +String.valueOf(getAccntBalance())+"-MinimumBalance:"+String.valueOf(getMinBalance());
        return str;
    }
}