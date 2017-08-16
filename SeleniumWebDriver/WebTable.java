package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.geckodriver.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("www.espncricinfo.com/ci/engine/match/415281.html");
		WebElement testtable = driver.findElement(By.id("inningsBat1"));
		
		List<WebElement>numberOfRows = driver.findElements(By.tagName("<tr>"));
		System.out.println(numberOfRows);
		
		driver.quit();
	}

}