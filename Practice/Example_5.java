package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_5 {
	public static void main(String[] args){
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement Radio_example = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[2]/div/a[3]")));
		Radio_example.click();
		List <WebElement> radio =  driver.findElements(By.xpath("//input[@type='radio']"));
	    int size = radio.size();
		int i;
		for(i=0;i<size;i++) {
			String value = radio.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("Male")) {
				radio.get(i).click();
			}
			if(value.equalsIgnoreCase("15 - 50")){
				radio.get(i).click();
			}
		}
		WebElement submit1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/p[2]/button")));
		submit1.click();
		WebElement submit2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button")));
		submit2.click();
		
	}
}
