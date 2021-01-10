public class Employee{
    private String employeeId;
    private double salary;
    private String[] certification;
    private int rating;
    
    public Employee(){
        
    }
    
    public Employee(String id, double sal, String[] certi){
        employeeId = id;
        salary = sal;
        certification = certi;
    }
    
    public void findRating(){
        rating = 0;
        for(int j = 0; j < certification.length; j++){
            if(certification[j].equals("JAVA") || certification[j].equals("ORACLE") || certification[j].equals("GCUX") || certification[j].equals("CCNA") || certification[j].equals("AWS"))
                rating++;
        }
    }
    
    public double getSalary(){
        return salary;
    }
    
    public int getRating(){
        this.findRating();
        return rating;
    }
    
    public double calculateIncrement(){
        this.findRating();
        double increment = 0;
        switch(rating){
            case 1:
                increment = salary * 2 / 100;
                salary = salary + increment;
                return increment;
            case 2:
                increment = salary * 3.5 / 100;
                salary = salary + increment;
                return increment;
            case 3:
                increment = salary * 5 / 100;
                salary = salary + increment;
                return increment;
            case 4:
                increment = salary * 7.5 / 100;
                salary = salary + increment;
                return increment;
            case 5:
                increment = salary * 10 / 100;
                salary = salary + increment;
                return increment;
            default:
                salary += increment;
                return increment;
        }
    }
}