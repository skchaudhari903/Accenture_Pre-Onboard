public class Student{
    private int id;
    private String name;
    private int marks[];
    private float average;
    private char grade;
    public Student(int a,String b,int[] c){
        id = a;
        name = b;
        marks = c;
    }
    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
    public void setMarks(int[] marks){
        this.marks = marks;
    }
    public int[] getMarks(){
        return marks;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAverage(float n){
        average = n;
    }
    public float getAverage(){
        return average;
    }
    public void setGrade(char n){
        grade = n;
    }
    public char getGrade(){
        return grade;
    }
    public void calculateAvg(){
        float a1 = 0.0F;
        for(int a = 0; a < this.getMarks().length; a++)
            a1 = a1 + this.marks[a];
        this.setAverage(a1/getMarks().length);
    }
    public void findGrade(){
        int min = this.marks[0];
        for(int b = 0; b < this.getMarks().length; b++)
        {
            if(this.marks[b] < min)
                min = this.marks[b];
        }
        if(min < 50)
            this.setGrade('F');
        else if(this.getAverage() >= 80 && this.getAverage() <= 100)
            this.setGrade('O');
        else
            this.setGrade('A');
    }
}