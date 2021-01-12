public abstract class Account {
    
    
    //Uncomment the getters and setters after writing the attributes
    
    protected int accountNumber;
    protected Customer customerObj;
    protected double balance;
    public Account(int accountNumber,Customer customerObj,double balance){
        setAccountNumber(accountNumber);
        setCustomerObj(customerObj);
        setBalance(balance);
    }
    public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    public abstract boolean withdraw(double amount);
    
}   