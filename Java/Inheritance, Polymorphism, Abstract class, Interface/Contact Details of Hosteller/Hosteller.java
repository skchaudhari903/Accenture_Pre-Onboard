class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    public Hosteller(){
        hostelName=" ";
        roomNumber=0;
    }
    public void setHostelName(String x){
        hostelName=x;
    }
    public void setRoomNumber(int y){
        roomNumber=y;
    } 
    public String getHostelName(){
        return hostelName;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
}