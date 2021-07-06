package Practice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_8 {
	public static void main(String [] args){
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement dropdown_example = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basic\"]/div/a[4]")));
		dropdown_example.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Select s = new Select(dropdown);
		List options = s.getOptions();
		int size = options.size(),i;
		for(i=0;i<size;i++) {
			if(i%2 == 0) {
				s.selectByIndex(i);
			}
		}
		WebElement display_all = driver.findElement(By.xpath("//button[@id=\"printAll\"]"));
		display_all.click();
	}
}
