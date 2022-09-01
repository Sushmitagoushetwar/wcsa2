package launchBrouser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Flipkart.com");
		Thread.sleep(5000);
		driver.close();
	}
}
