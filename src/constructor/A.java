package constructor;

public class A extends B {
	
//	Rule #1: Name of constructor and class must be same
//	Rule #2: Constructor doesn't have a return type
//	Rule #3: Constructor can take the arguments
//	Rule #4: We can have multiple constructor inside a class
//	Rule #5: A constructor can call another constructor but that would be in the first line only
//	Rule #6: Whenever we call a constructor then automatically it calls the parent constructor
	
//	usage
	
//	It is used to initialize the data members of the class
	
	
	public A(int i)
	{
		System.out.println("1 argument Constructor is executing");
	}
	
	public A()
	{
		this(50);
		System.out.println("no argument Constructor is executing");
	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		
		
	}
	

}
