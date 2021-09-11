package java_classes;

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		
	/*	Parent.staticMethod();
		Parent parent = new Parent();
		parent.instanceMethod();
		*/

					/*
					Child child = new Child();
					Parent parent = new Parent();
					child.instanceMethod();
					parent.instanceMethod();*/
					
					Child child = new Child();
					/*p.instanceMethod();
					p.staticMethod();*/
					
					Parent pp = child.instanceMethod();//new Parent();
					
					pp.instanceMethod();
					
					
	}
	private Child()
	{
		
	}
	protected Parent instanceMethod()
	{
		System.out.println("Child class instance method");
		return new Parent();
	}
	
	public void test12345()
	{
		
	}
	
	public static Child staticMethod1()
	{
		return new Child();
	}

}
