package Task_8;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Randomsite {
	Savetoxlsx sx = new Savetoxlsx();
	Modifyxlsx mx = new Modifyxlsx();
	WebDriver open_site() throws Exception  {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Day8\\src\\chromedriver.exe");
		WebDriver chrome_driver = new ChromeDriver();
		chrome_driver.get("https://www.random.org/");
		Thread.sleep(500);
		List <WebElement> links = chrome_driver.findElements(By.xpath("//div[@class]//a"));
		links.get(20).click();
		return(chrome_driver);
	}
	
	WebDriver Set_values(WebDriver driver) throws Exception{
		driver.findElement(By.xpath("//input[@name=\"sets\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"sets\"]")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name=\"num\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"num\"]")).sendKeys("100");
		driver.findElement(By.xpath("//input[@name=\"min\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"min\"]")).sendKeys("1");
		String value = mx.get_rowcount();;//Take value from xlsx file
		driver.findElement(By.xpath("//input[@name=\"max\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"max\"]")).sendKeys(value);
		driver.findElement(By.xpath("//input[@name=\"sort\"]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//form//input[@value=\"Get Sets\"]")).click();
		return (driver);
	}
	
	void Get_set(WebDriver driver) throws Exception {
		List <WebElement> set = driver.findElements(By.xpath("//ul[@class=\"data\"]//li"));
		String s2="";
		for(WebElement i: set) {
				s2=s2+i.getText();
		}
		String s3 = s2.substring(7);
		String S [] = s3.split(", ");
		sx.save_to_sheet(S, S.length);
//		for(i=0;i<size;i++) {
//			System.out.print(S[i]+" ");//Send this to Modifyxlsx class to save in new sheet
//		}
	}
}
