package testng_classes;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	
	@Test(groups= {"smoke","Regression"})	public void  test1()	{
		System.out.println("test1");
	}

	@Test(groups= {"sanity"})	public void  test2()
	{
		System.out.println("test2");
	
	}
	
	@Test(groups= {"Regression"})	public void  test3()
	{
		System.out.println("test3");

	}
	
	@Test(groups= {"sanity","Regression"})	public void  test4()
	{
		System.out.println("test4");

	}
	@Test(groups= {"smoke"})	public void  test5()
	{
		System.out.println("test5");
	
	}
	@Test(groups= {"Regression"})	public void  test6()	{
		System.out.println("test6");

	}
	@Test(groups= {"smoke"})	public void  test7()	{
		System.out.println("test7");

	}
}
