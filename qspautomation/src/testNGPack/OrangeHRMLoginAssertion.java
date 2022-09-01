package testNGPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import methodsOfWebElement.IsDisplayedMethod;

public class OrangeHRMLoginAssertion {
  WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}	

		@Test
	  public void OrangeHrmTest() throws InterruptedException 
	  {
		String loginpageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginpageTitle, "OrangHRM-log");
		Reporter.log("login page is verified",true);
		
	 //hardAssert
		boolean statusofUsernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusofUsernameTextBox, true);
		Reporter.log("username Text Box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//----------------------------------------------------------------------------
		
		//hardAssert
		boolean statusofpaswordTextBox = driver.findElement(By.name("password")).isDisplayed();
		Assert.assertEquals(statusofpaswordTextBox, true);
		Reporter.log("username Text Box is displayed",true);
		driver.findElement(By.name("password")).sendKeys("admin123");
		//--------------------------------------------------------------------------
		boolean statuslogibButtonTextBox = driver.findElement(By.xpath("//button[.=' Login '] ")).isDisplayed();
		Assert.assertEquals(statuslogibButtonTextBox, true);
		Reporter.log("username Text Box is displayed",true);
		driver.findElement(By.xpath("//button[.=' Login '] ")).click();
	//------------------------------------------
		Thread.sleep(5000);
		String homePageTitle = driver.getTitle();
		sa.assertEquals(homePageTitle, "Emlpoyee List");
		Reporter.log("HOme Page Title Is verified",true);
		Reporter.log("Add Employee",true);
		sa.assertAll();
		
	  }
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		
    }	
		

