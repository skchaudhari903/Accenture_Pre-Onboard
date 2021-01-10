public class Student{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public Student(int sid,String sname,String sadd){
        studentId = sid;
        studentName = sname;
        collegeName = "NIT";
        studentAddress=sadd;
        
    }
    public Student(int sid,String sname,String sadd,String cname){
        studentId=sid;
        studentName=sname;
        collegeName=cname;
        studentAddress=sadd;
    }
}