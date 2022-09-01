package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTelegram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://telegr.am/user_mgt/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("aghajh");
		driver.findElement(By.name("password")).sendKeys("ahsddgj1233");
		driver.findElement(By.name("F10296858036R23UI1")).click();
		}

}
