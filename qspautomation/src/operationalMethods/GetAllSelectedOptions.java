package operationalMethods;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20html%20file/multiselectdropdown.html");
		WebElement multiselectdd = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectdd);
		
		for(int i=2;i<=6;i++)
		{
			sel.selectByIndex(i);
		}
		
		List<WebElement> allselectedOps = sel.getAllSelectedOptions();
		
		
		for(WebElement op:allselectedOps)
		{
			String text = op.getText();
			System.out.println(text);
		}
		
	}

}
