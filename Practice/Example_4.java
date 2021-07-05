package Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_4 {
	public static void main(String[] args){
		Opensite os = new Opensite();
		WebDriver driver = os.Open();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement Checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[2]/div/a[2]")));
		Checkbox.click();
		List<WebElement> boxs = driver.findElements(By.className("cb1-element"));
		int number_of_box = boxs.size(),i;
		for(i=0;i<= number_of_box;i++) {
			boxs.get(i).click();
			wait = new WebDriverWait(driver,10);
		}
//		WebElement checkall = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/input[1]")));
//		checkall.click();
	}
}
