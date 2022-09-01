package testNGPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeloginAssertion {
  WebDriver driver;
  @BeforeMethod
  public void setUp()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("http://127.0.0.1/login.do;jsessionid=ub24pka1rmdo");
  }
	@Test
  public void ActiTimeTest() throws InterruptedException
	{
		String loginPageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		//softAssert
		sa.assertEquals(loginPageTitle, "actiTIME - Login");
		Reporter.log("login page title is verified",true);
		
		//hardAssert
		boolean statusOfUsernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusOfUsernameTextBox,true);
		Reporter.log("username text box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		//-------------------------------------------------------------------------------------------
		//hard assert
		boolean statusOfPasswordTextBox = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusOfPasswordTextBox, true);
		Reporter.log("password text box is displayed",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//--------------------------------------------------------------------------
		//hard Assert
		boolean statusOfLoginButton = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(statusOfLoginButton, true);
		Reporter.log("Login buttonis displayed",true);
		driver.findElement(By.id("loginButton")).click();
		//--------------------------------------------------------------------------------
		Thread.sleep(2000);
		String homePageTitle = driver.getTitle();
		sa.assertEquals(homePageTitle, "actitime-Enter Time-Track");
		Reporter.log("Home page title is verified",true);;
		
		Reporter.log("crreate user",true);
		Reporter.log("create reports",true);
		sa.assertAll();
		
  }
}
