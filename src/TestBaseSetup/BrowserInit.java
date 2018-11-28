package TestBaseSetup;

import Base.ChromeDriver;
import Base.WebDriver;

public class BrowserInit {

	public static WebDriver initChromeDriver() {
		// WebDriver driver;
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}

