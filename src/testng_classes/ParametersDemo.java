package testng_classes;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	
	@Test
	@Parameters({"value1","value2"})
	public void test(String print, @Optional("25") int value)
	{
		System.out.println(print);
		System.out.println(value);

	}

}
