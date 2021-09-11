package java_classes;

import java.io.File;


public class ExceptionHandling extends NullPointerException {

	static String s;
	public static void main(String[] args) throws InterruptedException
	{
		test();
	}
	
	public static void test() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println(s.length());
		File f = new File("");
		
		throw new NullPointerException();
	}
}
