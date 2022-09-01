package testNGPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2 {
  @Test
  public void f() 
  {
	  
	  Reporter.log("Enter the url",true);
	  //use softassert for continue the execution
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(true, true);
	  Reporter.log("Enter the username",true);
	  Reporter.log("Enter the password",true);
	  Assert.assertEquals(true, true);
	  //Assert.assertEquals(false, true);
	  Reporter.log("Click on login button",true);
	  Reporter.log("Verify the homePage",true);
	  Reporter.log("Create a user",true);
	  Reporter.log("Create a report",true);
	  Reporter.log("delete a User",true);
	  sa.assertAll();
  }
}
