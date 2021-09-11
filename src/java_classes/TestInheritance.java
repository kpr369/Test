package java_classes;

public class TestInheritance extends TestNew {

	public static void main(String[] args) {
		
		SubChild sc = new SubChild();
		sc.test1();
		
	}
	
	
}
class TestNew
{
	
	 public static void testme()
		{
			System.out.println("Hello");
		}
	 public void tt()
		{
			
		}
}

class SubChild extends TestInheritance
{
		public static void test1()
		{
			TestInheritance sc = new SubChild();
			sc.tt();
}
		
	
}


/// Object -> TestNew --> TestInheritance--> SubChild