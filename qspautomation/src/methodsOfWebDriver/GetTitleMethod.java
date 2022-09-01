package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://plasements.qspider.com/");
		String titleOfTheWebPage =driver.getTitle();//it is used to get the title of the current webpage
		System.out.println(titleOfTheWebPage);
		
	}

}
