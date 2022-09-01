package webBasedPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChroOmayoBlogspot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.xpath("(//form[@name='form1']/input)[1]")).sendKeys("automation");
		new Actions(driver).doubleClick(driver.findElement(By.xpath("(//form[@name='form1']/input)[1]"))).perform();
		Thread.sleep(3000);
		
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_C);
		ro.keyRelease(KeyEvent.VK_C);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
