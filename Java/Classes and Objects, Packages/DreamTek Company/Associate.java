public class Associate{
    private int associateId;
    private String associateName;
    private String workStatus;
    
    public int getAssociateId()
    {
        return this.associateId;
    }
    
    public void setAssociateId(int associateId)
    {
        this.associateId=associateId;
    }
    
    public String getAssociateName()
    {
        return this.associateName;
    }
    
    public void setAssociateName(String associateName)
    {
        this.associateName=associateName;
    }
    
    public String getWorkStatus()
    {
        return this.workStatus;
    }
    
    public void setWorkStatus(String workStatus)
    {
        this.workStatus=workStatus;
    }
    
    public void trackAssociateStatus(int days)
    {   
        //days=abs(days);
        
        if(days>=1&&days<=20)
        {
            this.setWorkStatus("Core skills");
        }
        
        else if(days>=21 && days<=40)
        {
            this.setWorkStatus("Advanced modules");
        }
        
        else if(days>=41 && days<=60)
        {
            this.setWorkStatus("Project phase");
        }
        
        else
        {
            this.setWorkStatus("Deployed in project");
        }
    }
}