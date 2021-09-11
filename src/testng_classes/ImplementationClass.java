package testng_classes;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementationClass implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
	    
		System.out.println(result.getMethod().getMethodName()+" Test Cases is executing");
	  }

}
