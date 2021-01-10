public class Call{
    private int callId;
    private long calledNumber;
    private float duration;
    
    public void Call(){
    }
    
    public void parseData(String data){
        this.callId=Integer.parseInt(data.substring(0,3));
        this.calledNumber=Long.parseLong(data.substring(4,14));
        this.duration=Float.parseFloat(data.substring(15));
    }
    
    public int getCallId(){
        return this.callId;
    }
    
    public long getCalledNumber(){
        return this.calledNumber;
    }
    
    public float getDuration(){
        return this.duration;
    }
}