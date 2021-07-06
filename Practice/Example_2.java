package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_2 {
	public static void main(String[] args){
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Form_demo =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"basic\"]//a[@class=\"list-group-item\"][1]")));
		Form_demo.click();
		WebElement avalue = driver.findElement(By.xpath("//input[@id=\"sum1\"]"));
		avalue.sendKeys("103");
		WebElement bvalue = driver.findElement(By.xpath("//input[@id=\"sum2\"]"));
		bvalue.sendKeys("77");
		WebElement Total = driver.findElement(By.xpath("//form[@id=\"gettotal\"]//button[@class=\"btn btn-default\"]"));
		Total.click();
	}
}
