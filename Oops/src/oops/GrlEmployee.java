package oops;
public class GrlEmployee 
{
    int empid;
    String empname;
    int empsalary;
    String empdepartment;
    int empexperience;
    void display ()
    {
    	System.out.println(empid);
    	System.out.println(empname);
    	System.out.println(empsalary);
    	System.out.println(empdepartment);
    	System.out.println(empexperience);
    }
    public static void main(String args[])
    {
	  GrlEmployee emp1=new GrlEmployee();
	   emp1.empid=110;
	   emp1.empname="Balaji";
	   emp1.empsalary=60000;
	   emp1.empdepartment="DEVE";
	   emp1.empexperience=5;
	   emp1.display();
    }
}
    

