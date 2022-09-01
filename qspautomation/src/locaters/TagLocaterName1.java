package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocaterName1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Desktop/Selenium%20html%20file/usernametextbox.html");
	//hoe to user tagName locater
	driver.findElement(By.tagName("input")).sendKeys("admin");
	
  }
}
