public class Student{
    private int sid;
    private String sname;
    private Department department;
    public Department getDepartment()
    {
        System.out.println("Department id:"+department.getDid());
        System.out.println("Department name:"+department.getDname());
        return department;
    }
    public int getSid()
    {
        return sid;
    }
    public String getSname()
    {
        return sname;
    }
    public void setSid(int id)
    {
        sid=id;
    }
    public void setSname(String name)
    {
        sname=name;
    }
    public void setDepartment(Department d)
    {
        department=new Department();
        department=d;
    }
}