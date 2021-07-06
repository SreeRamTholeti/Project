package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opensite {
	public WebDriver Open(){
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Day7\\src\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.seleniumeasy.com/");
		WebElement Demo_site = driver.findElement(By.xpath("//div[@class=\"header-right\"]//a[@class=\"btn btn-success\"]"));
		Demo_site.click();
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"at-cv-lightbox-close\"]")));
		popup.click();
		WebElement Startpractice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"btn_basic_example\"]")));
		Startpractice.click();
		return driver;
	}
}
