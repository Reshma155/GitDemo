package tesngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DemoTest {
  @Test
  public void f() {
	  System.out.println("Jira Updates---1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Jira Updates---2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Jira Updates---3");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Jira Updates---4");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Jira Updates---5");
	  System.out.println("Jira Updates---6");
  }

}
