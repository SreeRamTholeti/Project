package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exampl_1 {
	public static void main(String[] args){
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement Form_demo = driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[1]"));
		Form_demo.click();
		WebElement input = driver.findElement(By.xpath("//input[@id=\"user-message\"]"));
		input.sendKeys("My 1st Example");
		WebElement show_msg = driver.findElement(By.xpath("//form[@id=\"get-input\"]//button[@class=\"btn btn-default\"]"));
		show_msg.click();
	}
}
