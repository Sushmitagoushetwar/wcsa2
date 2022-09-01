package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.api.trace.Span;

public class RightClickContextMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("driver.get(\"https://www.seleniun.dev\");");
		
		WebElement target = driver.findElement(By.xpath("//Span[.='Downloads']"));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}


}
