package java_classes;

public class MethodsDemo {
	
	
	
int test =30;
int tt =45;

	public static void main(String[] args) {
		
		testMethod();
		
		MethodsDemo md = new MethodsDemo();
		md.testInstance();
		md.testInstance2();
		
	}
	 
	public static void testMethod()
	{
		System.out.println("Hello");
		
		testMethod1();
		
		System.out.println("Hello 5 ");
	}
	
	public static void testMethod1()
	{
		System.out.println("Hello 2");
	}
	
	public void testInstance()
	{
		System.out.println("Instance");
		testInstance2();
	}
	
	public void testInstance2()
	{
		
		System.out.println("Instance");
		System.out.println(test+tt);
	}
	
	
	public void test()
	{
		testMethod();
	}
}
