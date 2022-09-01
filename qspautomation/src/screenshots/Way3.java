package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		RemoteWebDriver rwd =(RemoteWebDriver)driver;
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		File src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot3.jpg");
		Files.copy(src, dest);
	   
	}
}
