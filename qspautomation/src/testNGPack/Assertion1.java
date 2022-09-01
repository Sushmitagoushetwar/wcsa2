package testNGPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion1 {
  @Test
  public void f() 
  {//use HardAssert for critical feature
	  Reporter.log("Enter the url",true);
	  Reporter.log("Enter the username",true);
	  Reporter.log("Enter the password",true);
	 
	 // Assert.assertEquals(true, true);
	  Assert.assertEquals(false, true);
	  Reporter.log("Click on login button",true);
	  Reporter.log("Verify the homePage",true);
	  Reporter.log("Create a user",true);
	  Reporter.log("Create a report",true);
	  Reporter.log("delete a User",true);
	  
  }
}
