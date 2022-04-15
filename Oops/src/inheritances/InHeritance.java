package inheritances;//single inheritance one parent and one child 



class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
	
}
class B extends A
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
	}

	

public class InHeritance {

	public static void main(String[] args) {
		 B bobj=new B();
		
	
		
	
	bobj.x=20;
       bobj.y=30;
        bobj.show();
		
		
		
		bobj.a=10;
        bobj.b=20;
        bobj.display();
	}
}

