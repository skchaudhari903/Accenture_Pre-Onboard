public class Student
{
    private int id,marks[];
    private String name;
    private float average;
    private char grade;
    public Student(){
        id = 0;
        marks = new int[100];
        name = " ";
        average = 0.0F;
        grade = ' ';
    }
    public int getId(){
        return id;
    }
    public int[] getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public float getAverage(){
        return average;
    }
    public char getGrade(){
        return grade;
    }
    public void setId(int n){
        id = n;
    }
    public void setMarks(int arr[]){
        marks = arr;
    }
    public void setName(String n){
        name = n;
    }
    public void setAverage(float n){
        average = n;
    }
    public void setGrade(char n){
        grade = n;
    }
    public void calculateAvg(){
        int s = 0;
        for(int a = 0; a < marks.length; a++)
            s = s + marks[a];
        double b=s;
        average = (float)(b/marks.length);
    }
    public void findGrade(){
        if(average <= 100 && average >= 80)
            grade='O';
        else if(average>=50 && average<80)
            grade = 'A';
        else if(average<50)
            grade ='F';
    }
}