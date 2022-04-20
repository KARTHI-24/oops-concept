
abstract class AbstractAnimal {
	// always implementation of abstract methods will be written in drived class
	abstract  void  move();
	abstract  void  eat();
	
	// concrete method or concrete class it contains complete implementation part
	void  label()  {
		
	System.out.println("Animal's data:");
	}
	
	}


class  Bird  extends AbstractAnimal {
void  move()  {
	
System.out.println("Moves by flying.");
}
void  eat()  {
	
System.out.println("Eats birdfood.");
}

}

class  Fish  extends AbstractAnimal {
void  move()  {
System.out.println("Moves by swimming.");
}
void  eat()  {
System.out.println("Eats seafood.");
}
}
