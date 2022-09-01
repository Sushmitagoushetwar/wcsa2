package testNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderCode {
 WebDriver driver;
	@Test(dataProvider = "dataprovider1")
  public void testActiTimeValidLogin(String invalidusername,String invalidpassword) 
  {
	driver.findElement(By.name("username"))	.sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
  }
  @BeforeMethod
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	   driver.get("http://127.0.0.1/login.do;jsessionid=ub24pka1rmdo");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dataprovider1()
  {
   Object[][]data=new Object[6][2];
   data[0][0]="admin";
   data[0][1]="manager123";
   
   data[1][0]="adn";
   data[1][1]="manager1";
   
   data[2][0]="adn";
   data[2][1]="manag123";
   
   data[3][0]="admn";
   data[3][1]="manager23";
   
   data[4][0]="amin";
   data[4][1]="manager12";
   
   data[5][0]="admin";
   data[5][1]="manager13";
   
   
   
return data;
   
  }
  
}
