package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void f()
  {  //Execute all the line which is line by line
	  Reporter.log("Enter the url",true);
	  Reporter.log("Enter the username",true);
	  Reporter.log("Enter the password",true);
	  Reporter.log("Click on login button",true);
	  Reporter.log("Verify the homePage",true);
	  Reporter.log("Create a user",true);
	  Reporter.log("Create a report",true);
	  Reporter.log("delete a User",true);
	  
  }
}
