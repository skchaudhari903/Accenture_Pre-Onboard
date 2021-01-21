import java.util.*;

public class TestMain{
    static Scanner sc=new Scanner(System.in);
    public static Feedback getObj(){
        Feedback f=new Feedback();
        System.out.println("Enter the feedback id:");
        f.setFeedbackId(sc.nextInt());
        System.out.println("Enter the course name:");
        f.setCourseName(sc.next());
        System.out.println("Enter the faculty id:");
        f.setFacultyId(sc.nextInt());
        System.out.println("Enter the feedbackRating:");
        f.setFeedbackRating(sc.nextInt());
        return f;
    }
    public static void prinObj(Feedback f){
        System.out.println("Feedback Id:"+f.getFeedbackId());
        System.out.println("Course Name:"+f.getCourseName());
        System.out.println("Faculty Id:"+f.getFacultyId());
        System.out.println("Feedback Rating:"+f.getFeedbackRating());
    }
    public static void main(String[] args){
        int cn;
        College c=new College();
        do{
            System.out.println("1.Add Feedback\n2.View All Feedback\n3.Search Feedback by courseName\n4.Get highest Feedback\n5.Exit");
            System.out.println("Enter your choice");
            cn=sc.nextInt();
            switch(cn){
                case 1:Feedback f=getObj();
                       c.addFeedback(f);
                       break;
                case 2:List<Feedback> f1=c.viewAllFeedbacks();
                    for(Feedback i:f1)
                        prinObj(i);
                        break;
                case 3:System.out.println("Enter the Course Name:");
                    List<Feedback> f2=c.viewFeedbackbyCourse(sc.next());
                    for(Feedback i:f2)
                        prinObj(i);
                        break;
                case 4:prinObj(c.getHighestFeedback());
                    break;
                case 5: break;
            }
        }
        while(cn!=5);
        System.out.println("Thank you for choosing the application");
    }
}