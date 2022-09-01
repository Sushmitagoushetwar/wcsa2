package parameterised;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1() {
	  Reporter.log("test1 method",true);
  }
  @Test
  public void test() {
	  Reporter.log("test2 method",true);
  }
  @BeforeMethod
  public void test3() {
	  Reporter.log("BeforeMethod Annotation",true);
  }
  @BeforeClass
  public void test4() {
	  Reporter.log("BeforClass Annotation",true);
  }
  @BeforeTest
  public void test5() {
	  Reporter.log("BeforeTest Annotation",true);
  }
  @AfterMethod
  public void test6() {
	  Reporter.log("AfterMethod Annotation",true);
  }
  @AfterClass
  public void test7() {
	  Reporter.log("AfterClass Annotation",true);
  }
  @AfterTest
  public void test8() {
	  Reporter.log("AfterTest Annotation",true);
  }
  
}
