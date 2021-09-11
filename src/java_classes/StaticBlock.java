package java_classes;

public class StaticBlock {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
	}

	static 
	{
		System.out.println("Static Block");
		try
		{
		System.exit(0);
		}finally
		{
			System.out.println("Hello");
		}
	}
	
}
