
public class MethodOverloading {
	
	int a;
	int b;
	int c;
	 void sum()
	{
		 {	a=10;
		b=20;
		c=30;}
		System.out.println(a+b+c);}
	 void sum(int x, int y)
	 {
		 
	System.out.println(x+y);
	 }
	 void sum(int x,int y,int z)
	 {
		 
		 System.out.println(x+y+z);
	 }
	 void sum(int x,int y,double z)
	 {
		 System.out.println(x+y+z);
	 }
	 public static void main(String args[])
	 {
		 MethodOverloading mo=new MethodOverloading();
		 mo.sum();
		 mo.sum(10,20);
		 mo.sum(10,20,30);
		 mo.sum(10,20,50.5);
	 }
	}
    

