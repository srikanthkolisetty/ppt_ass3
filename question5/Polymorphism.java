
public class Polymorphism {

	public void method(Shape shape)
	{
		System.out.println(shape.getClass().getName());
	}
	
	// Shape type can accept any type of object which implements Shape interface
	
	static public void main(String ...args)
	{
		new Polymorphism().method(new Triangle());
		new Polymorphism().method(new Rectangle());
		
	}
}


