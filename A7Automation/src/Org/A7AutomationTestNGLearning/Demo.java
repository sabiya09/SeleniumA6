package Org.A7AutomationTestNGLearning;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void test()
	{
		Reporter.log("test",true);
		
	}
	@Test
	public void m1()
	{
		
		Reporter.log("m1",true);
	}
	@Test
	public void method1()
	{
		Reporter.log("method1",true);
	}
	
}
