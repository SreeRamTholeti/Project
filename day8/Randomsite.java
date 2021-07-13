package Task_8;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Randomsite {
	Getfromxlsx getxl = new Getfromxlsx();
	String[] open_site(Integer number_of_rows) throws Exception  {
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
		String value = number_of_rows.toString();
		driver.findElement(By.xpath("//input[@name=\"max\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"max\"]")).sendKeys(value);
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name=\"sort\"]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//form//input[@value=\"Get Sets\"]")).click();
		List <WebElement> set = driver.findElements(By.xpath("//ul[@class=\"data\"]//li"));
		
		String s2="";
		for(WebElement i: set) {
				s2=s2+i.getText();
		}
		String s3 = s2.substring(7);
		String S [] = s3.split(", ");
		return(S);
//		for(i=0;i<size;i++) {
//			System.out.print(S[i]+" ");//Send this to Modifyxlsx class to save in new sheet
//		}
	}
}
