package SeleniumWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		driver.findElement(By.id("btnDivClose")).click();
		Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		s.selectByValue("2");
	}

}