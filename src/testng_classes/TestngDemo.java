package testng_classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");

	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");

	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");

	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");

	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");

	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");

	}
	@Test
	public void test() //TestNG method
	{
		System.out.println("Test");
	}

	
	@Test
	public void test1() //TestNG method
	{
		System.out.println("Test1");
	}
	
	
	
}

