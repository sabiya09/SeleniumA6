package Org.A7Automation.TestNGAnnotations;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
  @Test
  public void testCase1() {
	  Reporter.log("This is @test method1", true);
  }
  @BeforeSuite
  public void beforeSuit() {
	  Reporter.log("This is @Before suit method", true);
  }
  @AfterSuite
  public void afterSuit() {
	  Reporter.log("This is @After suit method", true);
  }
  @Test
  public void testCase2() {
	  Reporter.log("This is @test method 2", true);
  }
  @AfterTest
  public void afterTest() {
	  Reporter.log("This is @Aftertest method ", true);
  }
  
  @AfterClass
  public void afterClass() {
	  Reporter.log("This is @After Class method ", true);
  }
  @Test
  public void TestCase3() {
	  Reporter.log("This is @test method 3", true);
  }
  @AfterTest
  public void afterTest1() {
	  Reporter.log("This is @Aftertest method 1", true);
  }
  @AfterClass
  public void afterClass1() {
	  Reporter.log("This is @After Class method 1", true);

}
}
