package java_classes;

public class MethodsDemo2 {
	
	
	
	public static void main(String[] args) {
		
		int value =35;
		int test=55;
		int verify =25;
		String c="hello";
		
		tt(value,test,c);
		
	
	}

	public static int returnInteger()
	{
		System.out.println("Hello");
		
		return 25;
	}
	
	public static int tt(int a, int b,String c)
	{
		System.out.println(a*b+c);
		System.out.println(c);
		return a*b;
	}
	
	
	
}

