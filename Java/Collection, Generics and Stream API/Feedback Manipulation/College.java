import java.util.*;

public class College{
    //Implement the required business logic
    List<Feedback>feedbackList=new ArrayList<Feedback>();
    public void addFeedback(Feedback feedback){
        feedbackList.add(feedback);
    }
    public List<Feedback>viewAllFeedbacks(){
        return feedbackList;
    }
    public List<Feedback>viewFeedbackbyCourse(String name){
        List<Feedback> t1=new ArrayList<Feedback>();
        for(Feedback i:feedbackList){
            if(i.getCourseName().equals(name))
            t1.add(i);
        }
        return t1;
    }
    public Feedback getHighestFeedback(){
        int m=feedbackList.get(0).getFeedbackRating();
        Feedback f=feedbackList.get(0);
        for(Feedback i:feedbackList){
            if(i.getFeedbackRating()>m){
                m=i.getFeedbackRating();
                f=i;
            }
        }
        return f;
    }
}