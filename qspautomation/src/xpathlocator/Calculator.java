package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(1)' and .='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@onclick='r(3)' and .='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@onclick='r(0)' and .='0']")).click();
		Thread.sleep(3000);
		String actualResult = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println(actualResult);
		driver.navigate().refresh();
		}

}
