
public class Overridinganimal {//1)static method cannot be override
	                           //2)final method cannnot be override
	                           //3)with help of inheritance we can implement overriding concepts
		public  void  eat()  {
			
		System.out.println("This animal eats insects.");
		}
		}
class  Bird  extends Overridinganimal {
	
	
public  void  eat()  {
	
System.out.println("This bird eats seeds.");
}
}
class  TestBirdDynamic  {
	
public  static  void  main(String[] args)  {
	
Overridinganimal myAnimal =  new Overridinganimal();

myAnimal.eat();

Bird myBird =  new Bird();

myBird.eat();
}
}