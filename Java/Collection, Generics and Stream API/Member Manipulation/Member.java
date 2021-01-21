public class Member{
    private int memberId;
    private String memberName;
    private String address;
    
    public Member(){
    }
    public Member(int id,String name,String add){
        memberId=id;
        memberName=name;
        address=add;
    }
    public void setMemberId(int id){
        memberId=id;
    }
     public void setMemberName(String name){
        memberName=name;
    }
     public void setAddress(String add){
        address=add;
    }
    public int getMemberId(){
        return memberId;
    }
    public String getMemberName(){
        return memberName;
    }
    public String getAddress(){
        return address;
    }
    
}