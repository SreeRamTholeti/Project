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
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[2]/div/a[1]")));
		element.click();
		WebElement avalue = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/input"));
		avalue.sendKeys(String.valueOf(103));
		WebElement bvalue = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/div[2]/input"));
		bvalue.sendKeys(String.valueOf(77));
		WebElement Total = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button"));
		Total.click();
	}
}
