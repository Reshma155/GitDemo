package tesngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Reshma");
	  
	  String expected = "Hello TestNG";
	    String actual = "Hello TestNG";
	    Assert.assertEquals(actual, expected, "The actual and expected strings should match");
	    System.out.println("Test executed successfully!");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test ..");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("GoodMorning");
  }

}
