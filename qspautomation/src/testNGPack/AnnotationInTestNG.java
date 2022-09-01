package testNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationInTestNG {
  @Test
  public void f() 
  {
	  Reporter.log("test case 1 execution ",true);
  }
  @Test
  public void f1() 
  {
	  Reporter.log("test case 2 execution ",true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("beforeMethod executed",true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("afterClass executed",true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("beforeTest executed",true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("afterTest executed",true); 
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("beforeSuite executed",true); 
  }

  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("afterSuite executed",true);
  }

}
