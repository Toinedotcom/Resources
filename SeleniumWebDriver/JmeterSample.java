package SeleniumWebDriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JmeterSample {
	// @Test is a junit command
	// Now we can copy this file into jmeter in jmeter/lib/junit
	@Test
	public void testing() {
		// For performance testing you do not want to open multiple browser
		// windows
		// For this we use headless browser with HTMLUnitDriver
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://ebay.com");
		System.out.println(driver.getTitle());
	}

}
