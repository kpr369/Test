package java_classes;

public class ConstructorDemo extends Parent{
	
	public static void main(String[] args) {
		
		ConstructorDemo cd  = new ConstructorDemo();

	}
	public ConstructorDemo()
	{
		this("Test");
		System.out.println("Hi");
		
	}
	
	private ConstructorDemo(int a,String b)
	{
		System.out.println(a+b);
	}
	private ConstructorDemo(String a)
	{
		System.out.println(a);
	}
}
	
	

// this() , super()
//this, super