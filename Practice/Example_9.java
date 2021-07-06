package Practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_9 {
	@SuppressWarnings("null")
	public static void main(String [] args) throws Exception{
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Java_script = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basic\"]/div/a[5]")));
		Java_script.click();
		Thread.sleep(1000);
		List <WebElement> alertbox = driver.findElements(By.xpath("//*[@class=\"panel panel-primary\"]/div[@class=\"panel-body\"]/button"));
		int i,size = alertbox.size();
		Thread.sleep(500);
		for(i=0;i<size;i++) {
			alertbox.get(i).click();
			Alert alert =driver.switchTo().alert();
			Thread.sleep(500);
			if(i%2 == 0) {
				if(i == 2) {
					alert.sendKeys("Marvel");
					Thread.sleep(1000);
					alert.accept();
				}
				else {
					Thread.sleep(500);
					alert.accept();
				}
			}
			else {
				Thread.sleep(500);
				alert.dismiss();
			}
			Thread.sleep(500);
		}
//		alertbox.get(0).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2500);
//		alert.accept();
//		Thread.sleep(1000);
//		alertbox.get(1).click();
//		Alert alert_1 = driver.switchTo().alert();
//		Thread.sleep(2500);
//		alert_1.dismiss();
//		alertbox.get(2).click();
//		Alert alert_2 = driver.switchTo().alert();
//		driver.switchTo().alert().sendKeys("Marvel");
//		Thread.sleep(2500);
//		alert_2.accept();
	}
}
