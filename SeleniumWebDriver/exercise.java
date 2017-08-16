package SeleniumWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup of WebDriver
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Navigate to URL - in this case eBay
		driver.get("https://www.ebay.com");

		// Print the total count of links on the page
		System.out.println("Amount of links on the page");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Define var for footer of the page
		WebElement footerOfPage = driver.findElement(By.xpath(".//*[@id='glbfooter']"));

		// Print the total count of links in the footer section
		System.out.println("Links in the footer section:");
		System.out.println(footerOfPage.findElements(By.tagName("a")).size());

		// Iterate through the links in the footer and print each element
		for (int l = 0; l < footerOfPage.findElements(By.tagName("a")).size(); l++) {
			System.out.println(footerOfPage.findElements(By.tagName("a")).get(l).getText());

			// Once the iterator finds a link with name "Site map" it clicks
			// that link
			if (footerOfPage.findElements(By.tagName("a")).get(l).getText().contains("Site map")) {
				footerOfPage.findElements(By.tagName("a")).get(l).click();

				// Stop iterating through other links in the footer because you
				// found your link
				break;
			}
		}
		// Print the title of the page the driver is on - in this case the title
		// with text link "Site map"
		System.out.println("Title of the current page:");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
