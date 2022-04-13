package usingconstructor;

public class Employee 
{
  int empid;
   String empname;
   int empsalary;
   String empdepartment;
   int experience;
   
     Employee(int id,String name,int salary,String department,int exp)
     {
    	 empid=id;
    	 empname=name;
    	 empsalary=salary;
    	 empdepartment=department;
    	 experience=exp;
     }
     void display()
     {
    	 System.out.println(empid);
     	System.out.println(empname);
     	System.out.println(empsalary);
     	System.out.println(empdepartment);
     	System.out.println(experience);
     	
     }
     		public static void main(String args[] )
     		{
     		
     		Employee emp1=new Employee(10,"karthi",20,"mech",2);
    		emp1.display();
 		
     		
     	}
    	 
}
     
	
     
	
	

