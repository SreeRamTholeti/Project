package Task9;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenshot {
	File clickpic() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\Day8\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.random.org/");
		Thread.sleep(500);
		List <WebElement> links = driver.findElements(By.xpath("//div[@class]//a"));
		links.get(20).click();
		driver.findElement(By.xpath("//input[@name=\"sets\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"sets\"]")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name=\"num\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"num\"]")).sendKeys("100");
		driver.findElement(By.xpath("//input[@name=\"min\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"min\"]")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name=\"max\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"max\"]")).sendKeys("100");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name=\"sort\"]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//form//input[@value=\"Get Sets\"]")).click();
		Thread.sleep(100);
		WebElement set = driver.findElement(By.xpath("//ul[@class=\"data\"]//li"));
		
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",set);
		Thread.sleep(1000);
		
		TakesScreenshot tc = (TakesScreenshot)(driver);
		File pic = tc.getScreenshotAs(OutputType.FILE);
		File image = new File(".//random.jpeg");
		FileHandler.copy(pic,image);
		return(image);
	}

}
