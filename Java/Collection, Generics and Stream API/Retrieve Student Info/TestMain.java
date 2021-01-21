import java.util.*;

public class TestMain{
		
    public static ArrayList<String> retrieveStudentInfo(ArrayList<Student> al,String schoolName) {
       // implement the required business logic
    	ArrayList<String> str=new ArrayList<String>();
    	for(int i=0;i<al.size();i++){
    	Student s=al.get(i);
    	if(s.getSchoolName().equalsIgnoreCase(schoolName)){
    	    str.add(s.getStudName());
    	}
    }
    	return str;
    }
    
    public static void main(String[] args){
        Student s1=new Student();
        s1.setStudId(1);
        s1.setStudName("John");
        s1.setSchoolName("ZEE");
        Student s2=new Student();
        s2.setStudId(2);
        s2.setStudName("Tom");
        s2.setSchoolName("ZEE");
        Student s3=new Student();
        s3.setStudId(3);
        s3.setStudName("Peter");
        s3.setSchoolName("BEE");
        Student s4=new Student();
        s4.setStudId(4);
        s4.setStudName("Rose");
        s4.setSchoolName("OX-FO");
        Student s5=new Student();
        s5.setStudId(5);
        s5.setStudName("Alice");
        s5.setSchoolName("ZEE");
       
       //invoke the retrieveStudentInfo method and display the result
        ArrayList<Student>studentInfo=new ArrayList<Student>();
        studentInfo.add(s1);
        studentInfo.add(s2);
        studentInfo.add(s3);
        studentInfo.add(s4);
        studentInfo.add(s5);
        ArrayList<String>retrieveStudent=retrieveStudentInfo(studentInfo,"BEE");
        for(int i=0;i<retrieveStudent.size();i++){
            System.out.println(retrieveStudent.get(i));
        }
    }
}