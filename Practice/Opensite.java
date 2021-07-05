package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opensite {
	public WebDriver Open() {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Day7\\src\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.seleniumeasy.com/test/");
		wait = new WebDriverWait(driver, 30);
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[1]/div/div[2]/a")));
		popup.click();
		WebElement Startpractice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/p[2]/a/span")));
		Startpractice.click();
		return driver;
	}
}
