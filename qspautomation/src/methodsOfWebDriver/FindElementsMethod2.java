package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.google.com");//launch the google
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("bike");//type and search for bike
		Thread.sleep(2000);
		List<WebElement> webElementSuggessions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));//here  we get a multiple webElement list
		
		//with for each loop
				for (WebElement sugg : webElementSuggessions) 
				{
					String textOfWebelement = sugg.getText();
					System.out.println(textOfWebelement);
					
				}
		
		
		
	
	
	}
		

}
