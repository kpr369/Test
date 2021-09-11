package testng_classes;

import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	
	@Test(priority=1,description="this method for execution")
	public void login() //TestNG method
	{
		System.out.println("Login");
	}

	
	@Test(priority=1)
	public void homepage() //TestNG method
	{
		System.out.println("HomePage");
	}
	
	
	
	@Test(priority=0, invocationCount= 5)
	public void DashBoard() throws InterruptedException //TestNG method
	{
		Thread.sleep(1000);
	}
	

}
