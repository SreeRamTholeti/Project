package Webdrivers;

import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Launchchrome {
	public static void main(String[] args) throws IOException{
		Savingtoxlsx sxl = new Savingtoxlsx();
		sxl.createhead();
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\Day7\\src\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		WebElement name = driver.findElement(By.name("login"));
		WebElement password = driver.findElement(By.name("password"));
		name.sendKeys("SreeRamTholeti");
		password.sendKeys("sreeram@1");
		WebElement searchIcon = driver.findElement(By.name("commit"));
		searchIcon.click();
		
		List<WebElement> repositories = driver.findElements(By.xpath("//*[@id=\"repos-container\"]/ul/li"));
		int length = repositories.size(),rownum=1;
		for(WebElement i:repositories) {
			//System.out.println(i.getText());
			sxl.push(i.getText(),rownum++);
			
		}
		
		if(sxl.Save())
		{
			System.out.println("Done with saving the file");
		}
	}

}
