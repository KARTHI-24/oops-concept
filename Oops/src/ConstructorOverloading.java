
public class ConstructorOverloading {
	int a=10;
	int b=20;
	double c=30.5;
	
	ConstructorOverloading(int x,int y)
	{
		x=a;
		y=b;
	}
	ConstructorOverloading(int x,int y,double z)
	{
		x=a;
		y=b;
		z=c;
	}
	ConstructorOverloading(int x,double y)
	{
		x=a;
		y=b;
	
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	 public static void main(String args[])
	 {
		ConstructorOverloading cl=new ConstructorOverloading(10,20,40.5);
		 cl.display();
		 
	 }
	 
	
}
