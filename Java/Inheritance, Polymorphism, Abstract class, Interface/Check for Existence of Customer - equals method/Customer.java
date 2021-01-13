public class Customer{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    private String panno;
    public void setPanno(String panno){
        this.panno=panno;
    }
    public String getPanno(){
        return this.panno;
    }
    private String emailid;
    public void setEmailid(String emailid){
        this.emailid=emailid;
    }
    public String getEmailid(){
        return this.emailid;
    }
    private int salary;
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public Customer(String name, String panno,String emailid,int salary){
        this.name=name;
        this.panno=panno;
        this.emailid=emailid;
        this.salary=salary;
    }
    public boolean equals(Object o){
        Customer customer=(Customer) o;
        if(customer.getEmailid().equals(this.emailid) && customer.getPanno().equals(this.panno)){
            return true;
        }
        return false;
    }
}