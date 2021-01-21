import java.util.*;

public class Library{
    private List<Member> memberList=new ArrayList<Member>();
    public void setMemberList(List<Member> l){
        memberList=l;
    }
    public List<Member> getMemberList(){
        return memberList;
    }
    public void addMember(Member memberObj){
        memberList.add(memberObj);
    }
    public List<Member> viewAllMembers(){
        return memberList;
    }
    public List<Member> viewMembersByAddress(String address){
        List<Member> l=new ArrayList<Member>();
        for(Member obj:memberList){
            if(obj.getAddress().equalsIgnoreCase(address)){
                l.add(obj);
            }
        }
        return l;
    }
}