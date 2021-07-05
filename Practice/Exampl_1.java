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
		WebElement searchIcon = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/p[2]/a"));
		searchIcon.click();
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[2]/div/a[1]")));
		element.click();
		WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input"));
		message.sendKeys("My 1st Example");
		WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button"));
		submit.click();
	}
}
