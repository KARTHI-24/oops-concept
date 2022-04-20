class A//hierarchical inheritance/
{
	int a= 20;
	void display()
	{
		a=20;
		System.out.println(a);
	}
}
class B extends A
{
	int b=30;
	void show()
	{
		b=30;
		System.out.println("my mark is " + (b));
	}
}
class C extends A
{
    int c=30;
   void disc()
   {
    	
    	System.out.println(c);
    	}
    }
public class hierarchical {

	public static void main(String[] args) {
		C obj=new C();
		 obj.disc();
		 obj.display();
		 
		B obj1=new B();
		  obj1.show();
          obj1.display();
	}

}
//class A//multilevel inheritance
//{
//	int a= 20;
//	void display()
//	{
//		a=20;
//		System.out.println(a);
//	}
//}
//class B extends A
//{
//	int b=30;
//	void show()
//	{
//		b=30;
//		System.out.println("my mark is " + (b));
//	}
//}
//class C extends B 
//{
//    int c=30;
//    void disc()
//    {
//    	
//    	System.out.println(c);
//    	}
//    }
//public class hierarchical {
//
//	public static void main(String[] args) {
//		C obj=new C();
//         obj.disc();
//         obj.show();
//	
//
//
//
//
//
//	}
//}



























