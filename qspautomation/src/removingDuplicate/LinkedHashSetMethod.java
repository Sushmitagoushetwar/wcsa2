package removingDuplicate;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashSetMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20html%20file/multiselectdropdown.html");
		WebElement multiselectdd = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectdd);
		List<WebElement> ops = sel.getOptions();
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		
		for(int i=0;i<ops.size();i++)
		{
			 String textToInsert = ops.get(i).getText();
			 l.add(textToInsert);
		}
		for (String textToInsert : l) 
		{
			System.out.println(textToInsert);
		}
	}

}
