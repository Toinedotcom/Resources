package SeleniumWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SaucelabsTest {

	@Test
	public void setup() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");

		/*
		 * See Testparallel.java for more on RemoteWebDriver Similar to setting
		 * local webdriver up. This URL is the parameter that connects you to
		 * Saucelabs, the dc parameter gives the capabilities for version and
		 * platform
		 */
		WebDriver driver = new RemoteWebDriver(
				new URL("http://rahul1:e950d779-1817-4c3c-b122-06715b814dfd@ondemand.saucelabs.com:80/wd/hub"), dc);

		driver.get("http://ebay.com");
		System.out.println(driver.getTitle());

		driver.quit();
	}

}