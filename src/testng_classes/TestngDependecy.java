package testng_classes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngDependecy {
	
	
	@Test(dependsOnMethods="test2", alwaysRun = true)
	public void test1()
	{
		System.out.println("test1");

	}
	
	
	@Test
	public void test2()
	{
		SoftAssert sa = new SoftAssert();
		//assertEquals("heo", "hello","Tilte are not matched");
		sa.assertEquals(false, true);
		System.out.println("test2");
		System.out.println("test2");
		sa.assertEquals(false, true);
		System.out.println("test2");
		sa.assertEquals(true, true);
		sa.assertAll();
	}

}
