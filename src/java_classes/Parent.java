package java_classes;

public class Parent {

	int a =100;
	
		public static void staticMethod()
		{
			System.out.println("Parent Class Static method");
			
			Child c = Child.staticMethod1();
		
		}
		
		protected Object instanceMethod()
		{
			System.out.println("Parent Instance method");
			return new Object();
		}
		
		private  void test123()
		{
			System.out.println("abcd");
			
			Parent p = new Parent();
			
		}
		
		
		public Parent()
		{
			System.out.println("Parent");
		}
		
		
		
}
