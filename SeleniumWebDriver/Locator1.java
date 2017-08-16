package SeleniumWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.className("fbPageBannerInner")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("toine@schoenmaekers.com");
		driver.findElement(By.name("pass")).sendKeys("abc123");
		driver.findElement(By.cssSelector("#u_0_t")).click();
	}

}
