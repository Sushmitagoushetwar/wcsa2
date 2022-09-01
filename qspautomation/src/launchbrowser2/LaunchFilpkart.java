package launchbrowser2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFilpkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Flipkart.com");
		Thread.sleep(5000);
		driver.close();
	}
}
