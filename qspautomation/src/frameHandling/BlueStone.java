package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='confirmBtn' and .='Allow']")).click();
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.id("chat-widget"));
		driver.switchTo().frame(frameElement);
		 driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sushmita");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asndh@dn");
		 driver.findElement(By.xpath("(//input[@class='lc-22twvl e1xplv9i0'])[3]")).sendKeys("1234567890");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@class='lc-22twvl e1xplv9i0'])[4]")).sendKeys("abcde");
		 driver.findElement(By.xpath("//textarea[@class='lc-p0fmxn e61759e0']")).sendKeys("dhsfWKHFKasHJA");
		 
		 
	 
		 driver.findElement(By.xpath("//div[@class='lc-90q5um esv0owm0']")).click();
	}

}
