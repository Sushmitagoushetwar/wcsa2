package removingDuplicate;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20html%20file/multiselectdropdown.html");
		WebElement multiselectdd = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectdd);
		List<WebElement> ops = sel.getOptions();
		HashSet<String> h = new HashSet<String>();
		
		for(int i=0;i<ops.size();i++)
		{
			 String textToInsert = ops.get(i).getText();
			 h.add(textToInsert);
		}
		for (String textToInsert : h) 
		{
			System.out.println(textToInsert);
		}
	}

}
