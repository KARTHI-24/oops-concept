interface A{ 
	
	void Adisplay();
}
interface B{
	
	void Bshow();
}
 class C implements A ,B {
	public void Adisplay()
	{
		System.out.println("A DISPLAY");
	}
	public void Bshow()
	{
		System.out.println("B DISPLAY");
	}
}
public class Interface {
	public static void main(String[] args) {
		C obj=new C();
		 obj.Adisplay();
		 obj.Bshow();
}
}