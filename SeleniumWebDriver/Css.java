package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.cssSelector(".isp")).click();
		//xpath= //tagname[@attribute='value']
		//css == tagname[attribute='value']
			//	div[class='identity-first']
				
	}

}
