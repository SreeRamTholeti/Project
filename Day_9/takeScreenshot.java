package Task9;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenshot {
	String clickpic() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\Day8\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",set);
		Thread.sleep(1000);
		String current_url = driver.getCurrentUrl();
		
		Robot rob = new Robot();
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage img_robot = rob.createScreenCapture(screenSize);
		String path=System.getProperty("user.dir")+"RImage.jpeg";
		ImageIO.write(img_robot, "jpeg",new File(path)); 
        return path;
		
	}

}
