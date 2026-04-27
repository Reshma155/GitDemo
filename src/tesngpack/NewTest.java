package tesngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Reshma Kapil Phadtare");
	  
	  String expected = "Hello TestNG";
	    String actual = "Hello TestNG";
	    Assert.assertEquals(actual, expected, "The actual and expected strings should match");
	    System.out.println("Test executed successfully!");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test ..");



	  System.out.println("PostJira 1");
	  System.out.println("PostJira 2");


	  System.out.println("PostJira 1");
	  System.out.println("PostJira 2");

	  System.out.println("PostJira 1");
	  System.out.println("PostJira 2");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test..");
	  System.out.println("Web Automation..");
	  System.out.println("GoodMorning");
	  System.out.println("PostJira 3");
	  System.out.println("PostJira 4");
	  
  }

}
